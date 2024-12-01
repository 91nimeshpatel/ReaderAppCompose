package com.nimeshpatel.readerapp.screens.stats

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.sharp.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.nimeshpatel.readerapp.R
import com.nimeshpatel.readerapp.component.ReaderAppBar
import com.nimeshpatel.readerapp.model.MBook
import com.nimeshpatel.readerapp.screens.home.HomeViewModel
import com.nimeshpatel.readerapp.utils.formatDate

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@Composable
fun BookStatusScreen(
    navController: NavController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {

    Scaffold(
        topBar = {
            ReaderAppBar(
                title = stringResource(R.string.book_stats),
                icon = Icons.Default.ArrowBack,
                showProfile = false,
                navController = navController,
            ) {
                navController.popBackStack()
            }

        },
    ) { innerPadding ->
        Surface(modifier = Modifier.padding(paddingValues = innerPadding)) {
            homeViewModel.fetchBookByUser()
            StatusScreen(navController, homeViewModel)
        }
    }

}

@Composable
fun StatusScreen(navController: NavController, homeViewModel: HomeViewModel) {
    val books = homeViewModel.listOfBooks.toList()
    val readingBooks = books.filter { it.startedReading != null && it.finishedReading == null }
    val finishedBooks = books.filter { it.startedReading != null && it.finishedReading != null }
    Column(modifier = Modifier.padding(10.dp)) {
        Row(
            modifier = Modifier
                .size(45.dp)
                .padding(2.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(45.dp)
                    .padding(2.dp)
            ) {
                Icon(
                    imageVector = Icons.Sharp.Person,
                    contentDescription = "icon"
                )
            }
        }


        Text(
            text = "Hi, ${
                homeViewModel.currentUserName.uppercase()
            }"
        )


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            shape = CircleShape,
            colors = CardDefaults.cardColors(Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
        ) {

            Column(modifier = Modifier.padding(start = 20.dp)) {
                Text(
                    text = stringResource(R.string.your_stats),
                    style = MaterialTheme.typography.bodyLarge
                )
                HorizontalDivider()
                Text(
                    text = "${stringResource(R.string.your_reading)}: ${readingBooks.size} ${
                        stringResource(
                            R.string.books
                        )
                    } "
                )
                Text(
                    text = "${stringResource(R.string.your_have_read)}: ${finishedBooks.size} ${
                        stringResource(
                            R.string.books
                        )
                    } "
                )
            }
        }

        Spacer(modifier = Modifier.padding(bottom = 10.dp))
        HorizontalDivider()

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(
                items = finishedBooks
            ) { books ->
                BookRowStats(books)
            }

        }

    }
}

@Composable
fun BookRowStats(book: MBook) {
    Card(modifier = Modifier
        .clickable {

        }
        .fillMaxWidth()
        .height(100.dp)
        .padding(3.dp),
        shape = RectangleShape,
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 7.dp)) {

        Row(
            modifier = Modifier.padding(5.dp),
            verticalAlignment = Alignment.Top
        ) {
            val imgUrl: String = book.photoUrl.toString()
                .ifEmpty { "https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=80&q=80" }


            AsyncImage(
                modifier = Modifier
                    .width(80.dp)
                    .fillMaxHeight()
                    .padding(end = 4.dp),
                model = imgUrl,
                contentDescription = "Book Image",
            )

            Column {
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    if ((book.rating ?: 0.0) >= 4.0) {
                        Spacer(modifier = Modifier.fillMaxWidth(0.8f))
                        Icon(
                            imageVector = Icons.Default.ThumbUp,
                            contentDescription = "Thumbs Up",
                            tint = Color.Green.copy(alpha = 0.5f)
                        )
                    } else {
                        Box {}
                    }
                }
                Text(
                    text = "Author: ${book.authors.toString()}",
                    style = MaterialTheme.typography.bodySmall,
                    overflow = TextOverflow.Clip,
                    fontStyle = FontStyle.Italic
                )
                Text(
                    text = "Started: ${formatDate(book.startedReading!!)}",
                    style = MaterialTheme.typography.bodySmall,
                    overflow = TextOverflow.Clip,
                    fontStyle = FontStyle.Italic
                )
                Text(
                    text = "Finished: ${formatDate(book.finishedReading!!)}",
                    style = MaterialTheme.typography.bodySmall,
                    overflow = TextOverflow.Clip,
                    fontStyle = FontStyle.Italic
                )
            }
        }

    }
}
