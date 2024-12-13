package com.nimeshpatel.readerapp.screens.search

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nimeshpatel.readerapp.component.ReaderAppBar
import com.nimeshpatel.readerapp.navigation.ReaderScreens
import com.nimeshpatel.readerapp.ui.theme.SearchInputField

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SearchScreen(
    label: String = "",
    navController: NavController = rememberNavController(),
    searchViewModel: SearchViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            ReaderAppBar(
                title = "Search books",
                icon = Icons.Default.ArrowBack,
                showProfile = false
            ) {
                navController.navigate(ReaderScreens.HomeScreen.name)
            }
        },
    ) { innerPadding ->
        Surface(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues = innerPadding)) {
            Column() {
                SearchForm(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                ) {
                }

                Spacer(modifier = Modifier.height(16.dp))

                BookList(navController = navController)

            }
        }
    }
}

@Composable
fun BookList(navController: NavController) {

}

@Composable
fun SearchForm(
    modifier: Modifier = Modifier,
    onSearch: (String) -> Unit = {}
) {
    Column(modifier = modifier) {

        val searchQuery = rememberSaveable { mutableStateOf("") }
        val keyboardController = LocalSoftwareKeyboardController.current
        val valid = remember(searchQuery.value) {
            searchQuery.value.trim().isNotEmpty()
        }
        SearchInputField(
            value = searchQuery.value,
            onValueChange = { newValue ->
                searchQuery.value = newValue
            },
            keyboardActions = KeyboardActions {
                if (!valid) return@KeyboardActions

                onSearch(searchQuery.value.trim())
                searchQuery.value = ""
                keyboardController?.hide()

            }
        )

    }

}
