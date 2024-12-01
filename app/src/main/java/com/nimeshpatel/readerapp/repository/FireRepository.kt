package com.nimeshpatel.readerapp.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import com.nimeshpatel.readerapp.data.DataOrException
import com.nimeshpatel.readerapp.model.MBook
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Nimesh Patel on 12-Dec-24.
 * Purpose:
 */
@Singleton
class FireRepository @Inject constructor(firebaseFirestore: FirebaseFirestore) {
    // Reference to the "books" collection
    private val booksCollection = firebaseFirestore.collection("books")

    suspend fun getAllBooksFromDatabase(): DataOrException<List<MBook>, Boolean, Exception> {
        val dataOrException = DataOrException<List<MBook>, Boolean, Exception>()

        try {
            dataOrException.loading = true

            dataOrException.data = booksCollection.get().await().documents.map { documentSnapshot ->
                documentSnapshot.toObject(MBook::class.java)!!
            }

            if (!dataOrException.data.isNullOrEmpty()) dataOrException.loading = false

        } catch (e: FirebaseFirestoreException) {
            dataOrException.e = e
        }

        return dataOrException
    }

    // Delete a book by its ID
    suspend fun deleteBookById(bookId: String): Boolean {
        return try {
            booksCollection.document(bookId).delete().await()
            true
        } catch (e: FirebaseFirestoreException) {
            false
        }
    }

    // Update a book by its ID
    suspend fun updateBookById(bookId: String, bookToUpdate: Map<String, Comparable<*>?>): Boolean {
        return try {
            booksCollection.document(bookId).update(bookToUpdate).await()
            true
        } catch (e: FirebaseFirestoreException) {
            false
        }
    }

}