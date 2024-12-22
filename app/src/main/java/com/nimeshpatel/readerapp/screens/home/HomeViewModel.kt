package com.nimeshpatel.readerapp.screens.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
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
    private val firebaseFireStore: FirebaseFirestore,
    private val auth: FirebaseAuth
) : ViewModel() {

    var listOfBooks = emptyList<MBook>()
    val currentUserName =
        if (!FirebaseAuth.getInstance().currentUser?.email.isNullOrEmpty()) {
            FirebaseAuth.getInstance().currentUser?.email.toString()
                .split("@")[0]
        } else {
            "N/A"
        }

    private val _data: MutableState<DataOrException<List<MBook>, Boolean, Exception>> =
        mutableStateOf(DataOrException(listOf(), true, Exception("")))

    init {
        getAllBooksFromDatabase()
    }

    private fun getAllBooksFromDatabase() {
        viewModelScope.launch {
            _data.value.loading = true
            _data.value = repository.getAllBooksFromDatabase()
            if (!_data.value.data.isNullOrEmpty()) {
                _data.value.loading = false
            }
        }
    }

    fun fetchBookByUser(){
        listOfBooks =
            _data.value.data?.toList()?.filter { it.userId == auth.currentUser?.uid }
                ?: emptyList()
    }

}