package com.nimeshpatel.readerapp.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp


/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */

@Composable
fun CommonInputField(
    modifier: Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    trailingIcon: @Composable (() -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    isSingleLine: Boolean = true,
) {
    OutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        singleLine = isSingleLine,
        visualTransformation = visualTransformation,
        trailingIcon = trailingIcon,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Blue,
            focusedLabelColor = Color.Blue,
            errorTextColor = Color.Red,
            unfocusedTextColor = Color.Black,
            unfocusedLabelColor = Color.Black,
            cursorColor = Color.Blue,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
        )
    )
}

@Composable
fun EmailInputField(
    modifier: Modifier = Modifier.fillMaxWidth(),
    value: String,
    onValueChange: (String) -> Unit,
    maxLength: Int = 50,
    imeAction: ImeAction = ImeAction.Done,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    ) {
    CommonInputField(
        modifier = modifier,
        value = value,
        onValueChange = {
            if (it.length <= maxLength) {
                onValueChange(it)
            }
        },
        label = "Email",
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email,
            imeAction = imeAction
        ),
        keyboardActions = keyboardActions
    )
}

@Composable
fun PasswordInputField(
    modifier: Modifier = Modifier.fillMaxWidth(),
    value: String,
    onValueChange: (String) -> Unit,
    maxLength: Int = 15,
    imeAction: ImeAction = ImeAction.Done,
    keyboardActions: KeyboardActions = KeyboardActions.Default
) {
    var passwordVisible by remember { mutableStateOf(false) }

    CommonInputField(
        modifier = modifier,
        value = value,
        onValueChange = {
            if (it.length <= maxLength) {
                onValueChange(it)
            }
        },
        label = "Password",
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val icon =
                if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(imageVector = icon, contentDescription = "Toggle Password Visibility")
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Password,
            imeAction = imeAction
        ),
        keyboardActions = keyboardActions
    )
}

@Composable
fun SearchInputField(
    modifier: Modifier = Modifier.fillMaxWidth(),
    value: String,
    onValueChange: (String) -> Unit,
    maxLength: Int = 50,
    imeAction: ImeAction = ImeAction.Search,
    keyboardActions: KeyboardActions = KeyboardActions.Default

) {
    CommonInputField(
        modifier = modifier,
        value = value,
        onValueChange = {
            if (it.length <= maxLength) {
                onValueChange(it)
            }
        },
        label = "Search",
        trailingIcon = {
            IconButton(onClick = { /* Add Search Action */ }) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Text,
            imeAction = imeAction
        ),
        keyboardActions = keyboardActions
    )
}

@Composable
fun SubmitButton(
    text: String,
    isLoading: Boolean = false,
    isValidInput: Boolean = false,
    onClick: () -> Unit
) {

    Button(
        modifier = Modifier
            .padding(3.dp)
            .fillMaxWidth(),
        shape = CircleShape,
        enabled = !isLoading && isValidInput,
        onClick = onClick
    ) {
        if (isLoading) CircularProgressIndicator(modifier = Modifier.size(25.dp))
        Text(
            text = text,
            modifier = Modifier.padding(5.dp)
        )
    }

}