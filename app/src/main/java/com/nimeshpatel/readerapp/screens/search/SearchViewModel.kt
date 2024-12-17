package com.nimeshpatel.readerapp.screens.search

import android.util.Log
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nimeshpatel.readerapp.model.Item
import com.nimeshpatel.readerapp.repository.BookRepository
import com.nimeshpatel.readerapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: BookRepository
) : ViewModel() {

    var list: List<Item> by mutableStateOf(listOf())

    init {
        loadBooks()
    }

    private fun loadBooks() {
        searchBooks("android")
    }

    fun searchBooks(query: String) {
        viewModelScope.launch(Dispatchers.Default) {
            if (query.isEmpty()) {
                return@launch
            }
            try {
                when (val response = repository.getBooks(query)) {
                    is Resource.Success -> {
                        Log.e("SearchViewModel", "FetchBooks: Success ${response.data?.size}")
                        list = response.data!!
                    }

                    is Resource.Error -> {
                        Log.e("SearchViewModel", "searchBooks: error ${response.message}")
                    }

                    else -> {}
                }
            } catch (e: Exception) {
                Log.e("SearchViewModel", "searchBooks: ${e.message} ")
            }
        }
    }


}