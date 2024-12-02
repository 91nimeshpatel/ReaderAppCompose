package com.nimeshpatel.readerapp.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.nimeshpatel.readerapp.component.ReaderLogo
import com.nimeshpatel.readerapp.ui.theme.EmailInputField
import com.nimeshpatel.readerapp.ui.theme.PasswordInputField

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@Composable
fun LoginScreen(
    navController: NavController,
    loginViewModel: LoginViewModel = hiltViewModel()
) {
    val showLoginForm = rememberSaveable { mutableStateOf(true) }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            ReaderLogo()

            UserForm()
        }
    }
}

@Composable
fun UserForm() {
    val email = rememberSaveable { mutableStateOf("") }
    val password = rememberSaveable { mutableStateOf("") }
    EmailInputField(
        modifier = Modifier
            .padding(top = 50.dp)
            .fillMaxWidth(),
        value = email.value,
        onValueChange = { email.value = it },
        imeAction = ImeAction.Next,

    )

    Spacer(modifier = Modifier.height(10.dp))

    PasswordInputField(value = password.value, onValueChange = { password.value = it })
}
