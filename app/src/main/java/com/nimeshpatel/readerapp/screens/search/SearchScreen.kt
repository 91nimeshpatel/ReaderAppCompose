package com.nimeshpatel.readerapp.screens.search

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil3.compose.AsyncImage
import com.nimeshpatel.readerapp.R
import com.nimeshpatel.readerapp.component.ReaderAppBar
import com.nimeshpatel.readerapp.model.Item
import com.nimeshpatel.readerapp.navigation.ReaderScreens
import com.nimeshpatel.readerapp.ui.theme.SearchInputField

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
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
                navController = navController,
                showProfile = false
            ) {
                navController.navigate(ReaderScreens.HomeScreen.name)
            }
        },
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = innerPadding)
        ) {
            Column() {
                SearchForm(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                ) {
                    searchViewModel.searchBooks(it)
                }

                Spacer(modifier = Modifier.height(16.dp))

                BookList(navController = navController, searchViewModel)

            }
        }
    }
}

@Composable
fun BookList(navController: NavController, searchViewModel: SearchViewModel) {

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(items = searchViewModel.list,
            key = { it.id }) { item ->
            BookRow(item = item, navController = navController)
        }

    }

}
@Composable
fun BookRow(item: Item, navController: NavController) {
    Card(
        modifier = Modifier
            .clickable {

                navController.navigate(ReaderScreens.BookDetailScreen.name + "/${item.id}")
            }
            .fillMaxWidth()
            .height(100.dp)
            .padding(3.dp),
        shape = RectangleShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {

        Row(
            modifier = Modifier.padding(5.dp),
            verticalAlignment = Alignment.Top
        ) {
            val imageUrl = if (item.volumeInfo?.imageLinks?.smallThumbnail?.isEmpty() == true) {
                "https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=80&q=80"
            } else {
                item.volumeInfo?.imageLinks?.smallThumbnail.toString()
            }
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                placeholder = painterResource(R.drawable.ic_launcher_img),
                error = painterResource(R.drawable.ic_launcher_img), // Fallback drawable
                modifier = Modifier
                    .width(80.dp)
                    .fillMaxHeight()
                    .padding(end = 4.dp)
            )
            Column() {
                Text(
                    text = item.volumeInfo?.title ?: "",
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "Author : ${item.volumeInfo?.authors?.firstOrNull()}", softWrap = true,
                    overflow = TextOverflow.Clip,
                    fontStyle = FontStyle.Italic,
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "Date: ${item.volumeInfo?.publishedDate}", softWrap = true,
                    overflow = TextOverflow.Clip,
                    fontStyle = FontStyle.Italic,
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    item.volumeInfo?.categories.toString(), softWrap = true,
                    overflow = TextOverflow.Clip,
                    fontStyle = FontStyle.Italic,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
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
