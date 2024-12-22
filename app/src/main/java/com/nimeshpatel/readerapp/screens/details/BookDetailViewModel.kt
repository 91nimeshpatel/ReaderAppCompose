package com.nimeshpatel.readerapp.screens.details

import android.util.Log
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.nimeshpatel.readerapp.model.Item
import com.nimeshpatel.readerapp.model.VolumeInfo
import com.nimeshpatel.readerapp.repository.BookRepository
import com.nimeshpatel.readerapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@HiltViewModel
class BookDetailViewModel @Inject constructor(
    private val repository: BookRepository,
    private val firebaseFireStore: FirebaseFirestore,
    private val auth: FirebaseAuth
) : ViewModel() {

    companion object{
        private val TAG = BookDetailViewModel::class.java.name
    }


    suspend fun getBookInfo(bookId: String): Resource<Item> {
        return repository.getBookInfo(bookId)
    }

    fun saveBookInfo(
        bookData: VolumeInfo?, googleBookId: String?,
        processAction: (String) -> Unit = {}
    ) {
        val bookToSave: MutableMap<String, Any> = HashMap()

        bookToSave["title"] = bookData?.title.toString()
        bookToSave["authors"] = bookData?.authors.toString()
        bookToSave["description"] = bookData?.description.toString()
        bookToSave["notes"] = ""
        bookToSave["categories"] = bookData?.categories.toString()
        bookToSave["page_count"] = bookData?.pageCount.toString()
        bookToSave["book_photo_url"] = bookData?.imageLinks?.thumbnail.toString()
        bookToSave["published_date"] = bookData?.publishedDate.toString()
        bookToSave["rating"] = 0.0
        bookToSave["google_book_id"] = googleBookId.toString()
        bookToSave["user_id"] = auth.currentUser?.uid.toString()

        if (!googleBookId.isNullOrEmpty()) {
            // Check if the book already exists
            firebaseFireStore.collection("books")
                .whereEqualTo("google_book_id", googleBookId)
                .whereEqualTo("user_id", auth.currentUser?.uid.toString())
                .get()
                .addOnSuccessListener { querySnapshot ->
                    if (querySnapshot.isEmpty) {
                        // Book does not exist, proceed to save
                        firebaseFireStore.collection("books").add(bookToSave)
                            .addOnSuccessListener { documentReference ->
                                val stringId = documentReference.id
                                firebaseFireStore.collection("books").document(stringId)
                                    .update(hashMapOf("id" to stringId) as Map<String, Any>)
                                    .addOnCompleteListener {
                                        if (it.isSuccessful) {
                                            processAction.invoke("Book successfully added")
                                            Log.i(TAG, "Book successfully added")
                                        }
                                    }.addOnFailureListener {
                                        Log.w(TAG, "Error updating document ", it)
                                    }
                            }.addOnFailureListener { e ->
                                Log.w(TAG, "Error adding document", e)
                            }
                    } else {
                        processAction.invoke("Book already exists in the database")
                        Log.i(TAG, "Book already exists in the database")
                    }
                }.addOnFailureListener { e ->
                    Log.w(TAG, "Error checking existing document", e)
                }
        } else {
            Log.w(TAG, "Invalid googleBookId")
        }
    }

}