package com.nimeshpatel.readerapp.screens.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.nimeshpatel.readerapp.model.MUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@HiltViewModel
class LoginViewModel @Inject constructor(
    private val auth: FirebaseAuth,
    private val firebaseFireStore: FirebaseFirestore
) : ViewModel() {

    private val _loading = MutableLiveData<Boolean>(false)
    var loading: LiveData<Boolean> = _loading


    fun createUser(email: String, password: String, home: () -> Unit) {
        viewModelScope.launch {
            if (_loading.value == false) {
                _loading.value = true
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { status ->
                        Log.d("Create Account", "createUser: $status ")
                        if (status.isSuccessful) {
                            val displayName = status?.result?.user?.email.toString().split('@')[0]
                            createUser(displayName)

                            home()
                        }
                    }

            }
        }
    }

    private fun createUser(displayName: String) {
        val userId = auth.currentUser?.uid
        val user = MUser(
            userId = userId ?: "",
            displayName = displayName,
            avatarUrl = "https://i.pravatar.cc/300",
            quote = "Hello there",
            profession = "Android Developer",
            id = null
        ).toMap()

        firebaseFireStore
            .collection("users").add(user)
    }

    fun loginUser(email: String, password: String, home: () -> Unit) = viewModelScope.launch {
        try {
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { status ->
                    if (status.isSuccessful) {
                        home()
                    } else {
                        Log.d("Failed", " loginUser: ${status.exception}")
                    }
                }

        } catch (e: Exception) {
            Log.e("Exception", "loginUser: ${e.message}")
        }
    }
}