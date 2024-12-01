package com.nimeshpatel.readerapp.screens.home

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.nimeshpatel.readerapp.data.DataOrException
import com.nimeshpatel.readerapp.model.MBook
import com.nimeshpatel.readerapp.repository.FireRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: FireRepository,
    private val auth: FirebaseAuth
) : ViewModel() {

    var listOfBooks = mutableStateListOf<MBook>()
        private set

    val currentUserName = auth.currentUser?.email?.split("@")?.getOrNull(0) ?: "N/A"

    private val _data = mutableStateOf(DataOrException<List<MBook>, Boolean, Exception>())

    init {
        getAllBooksFromDatabase()
    }

    private fun getAllBooksFromDatabase() {
        viewModelScope.launch {
            try {
                _data.value = DataOrException(loading = true)
                val books = repository.getAllBooksFromDatabase().data ?: emptyList()
                _data.value = DataOrException(data = books, loading = false)
                fetchBookByUser()  // Automatically fetch user-specific books
            } catch (e: Exception) {
                _data.value = DataOrException(e = e, loading = false)
                Log.e("HomeViewModel", "Error fetching books", e)
            }
        }
    }

    fun fetchBookByUser() {
        val userId = auth.currentUser?.uid ?: return
        val newList = _data.value.data?.filter { it.userId == userId } ?: emptyList()

        if (listOfBooks != newList) {
            listOfBooks.clear()
            listOfBooks.addAll(newList)
        }
    }

    // Delete a book using the repository
    fun deleteBookById(mBook: MBook, onSuccess: () -> Unit) {
        viewModelScope.launch {
            mBook.id?.let { id ->
                val isDeleted = repository.deleteBookById(id)
                if (isDeleted) {
                    onSuccess.invoke()
                } else {
                    Log.e("HomeViewModel", "Failed to delete book with ID: $id")
                }
            }
        }
    }

    fun updateBookById(
        mBook: MBook,
        bookToUpdate: Map<String, Comparable<*>?>,
        onSuccess: () -> Unit
    ) {

        viewModelScope.launch {
            mBook.id?.let { id ->
                val isUpdated = repository.updateBookById(id, bookToUpdate)
                if (isUpdated) {
                    onSuccess.invoke()
                } else {
                    Log.e("HomeViewModel", "Failed to delete book with ID: $id")
                }
            }
        }

    }
}
