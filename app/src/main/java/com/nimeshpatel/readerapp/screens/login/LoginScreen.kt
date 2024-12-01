package com.nimeshpatel.readerapp.screens.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nimeshpatel.readerapp.component.ReaderLogo
import com.nimeshpatel.readerapp.navigation.ReaderScreens
import com.nimeshpatel.readerapp.ui.theme.EmailInputField
import com.nimeshpatel.readerapp.ui.theme.PasswordInputField
import com.nimeshpatel.readerapp.ui.theme.SubmitButton

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@Composable
fun LoginScreen(
    navController: NavController = rememberNavController(),
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

            if (showLoginForm.value) {
                UserForm(isLoading = false) { email, password ->
                    loginViewModel.loginUser(email,password){
                        navController.navigate(ReaderScreens.HomeScreen.name)
                    }
                }
            } else {
                UserForm(isLoading = false, isCreateAccount = true) { email, password ->
                    loginViewModel.createUser(email,password){
                        navController.navigate(ReaderScreens.HomeScreen.name)
                    }
                }
            }


            Spacer(modifier = Modifier.padding(15.dp))

            SignUpORLogin(showLoginForm)
        }
    }
}

@Composable
fun SignUpORLogin(showLoginForm: MutableState<Boolean>) {
    Row(
        modifier = Modifier.padding(bottom = 15.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        val strSignUpLogin = if (showLoginForm.value) "Sign Up" else "Login"
        val strAlreadyOrNew = if (showLoginForm.value) "New User?" else "Already Have Account ?"
        Text(text = strAlreadyOrNew)
        Text(
            text = strSignUpLogin,
            modifier = Modifier
                .clickable {
                    showLoginForm.value = !showLoginForm.value
                }
                .padding(start = 5.dp),
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun UserForm(
    isLoading: Boolean = false,
    isCreateAccount: Boolean = false,
    onDone: (String, String) -> Unit
) {
    val email = rememberSaveable { mutableStateOf("") }
    val password = rememberSaveable { mutableStateOf("") }
    val isValidInput = remember(email.value, password.value) {
        email.value.trim().isNotEmpty() && password.value.isNotEmpty()
    }

    val keyboardController = LocalSoftwareKeyboardController.current

    Spacer(modifier = Modifier.height(50.dp))

    if (isCreateAccount) {
        Text(
            text = "Please enter a valid email and password that is at least 6 characters",
            modifier = Modifier.padding(4.dp)
        )
    } else {
        Text("")
    }
    Spacer(modifier = Modifier.height(10.dp))

    EmailInputField(
        modifier = Modifier
            .fillMaxWidth(),
        value = email.value,
        onValueChange = { email.value = it },
        imeAction = ImeAction.Next,

        )

    Spacer(modifier = Modifier.height(10.dp))

    PasswordInputField(value = password.value,
        imeAction = ImeAction.Done,
        onValueChange = { password.value = it },
        keyboardActions = KeyboardActions {
            if (!isValidInput) return@KeyboardActions
            onDone(email.value.trim(), password.value.trim())
            keyboardController?.hide()
        })

    Spacer(modifier = Modifier.height(20.dp))

    SubmitButton(
        text = if (isCreateAccount) "Create Account" else "Login",
        isLoading = isLoading,
        isValidInput = isValidInput
    ) {

        onDone(email.value.trim(), password.value.trim())
        keyboardController?.hide()
    }
}

@Preview
@Composable
fun showPreview() {
    LoginScreen()
}
