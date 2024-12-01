package com.nimeshpatel.readerapp.screens.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import dagger.hilt.android.lifecycle.HiltViewModel

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@Composable
fun LoginScreen(navController: NavController,
                loginViewModel: LoginViewModel = hiltViewModel()
                ) {
    Text(" This iS Login Screen")
}