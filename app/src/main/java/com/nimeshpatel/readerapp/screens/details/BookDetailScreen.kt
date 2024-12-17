package com.nimeshpatel.readerapp.screens.details

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@Composable
fun BookDetailScreen(
    navController: NavController,
    bookId: String = "",
    viewModel: BookDetailViewModel = hiltViewModel()
) {
    Text("Book ID : $bookId")
}