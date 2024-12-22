package com.nimeshpatel.readerapp.screens.update

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@Composable
fun BookUpdateScreen(navController: NavController,
                     bookItemId: String) {

    Text("BookId ItemID is: $bookItemId")
}