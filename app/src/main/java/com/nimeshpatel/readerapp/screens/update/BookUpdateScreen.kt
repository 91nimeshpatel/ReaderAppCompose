package com.nimeshpatel.readerapp.screens.update

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.google.firebase.Timestamp
import com.nimeshpatel.readerapp.R
import com.nimeshpatel.readerapp.component.RatingBar
import com.nimeshpatel.readerapp.component.ReaderAppBar
import com.nimeshpatel.readerapp.component.RoundedButton
import com.nimeshpatel.readerapp.component.ShowAlertDialog
import com.nimeshpatel.readerapp.component.showToast
import com.nimeshpatel.readerapp.model.MBook
import com.nimeshpatel.readerapp.navigation.ReaderScreens
import com.nimeshpatel.readerapp.screens.home.HomeViewModel
import com.nimeshpatel.readerapp.ui.theme.CommonInputField
import com.nimeshpatel.readerapp.utils.formatDate

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@Composable
fun BookUpdateScreen(
    navController: NavController,
    bookItemId: String,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    Scaffold(topBar = {
        ReaderAppBar(
            title = "Update Book",
            icon = Icons.AutoMirrored.Default.ArrowBack,
            showProfile = false,
            navController = navController
        ) {
            navController.popBackStack()
        }
    }) { paddingValue ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValue)
        ) {
            val bookInfo = homeViewModel.listOfBooks.firstOrNull { book ->
                book.googleBookId == bookItemId
            }
            Column(
                modifier = Modifier.padding(3.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Surface(
                    modifier = Modifier
                        .padding(2.dp)
                        .fillMaxWidth(),
                    shape = CircleShape,
                    shadowElevation = 4.dp,
                    tonalElevation = 4.dp,
                    color = Color.White
                ) {
                    bookInfo?.let {
                        ShowBookUpdate(bookInfo = it)
                    }
                }

                bookInfo?.let {
                    ShowSimpleForm(homeViewModel = homeViewModel, book = it, navController)
                }


            }
        }
    }
}

@Composable
fun ShowSimpleForm(homeViewModel: HomeViewModel, book: MBook, navController: NavController) {
    val context = LocalContext.current
    val notesText = remember {
        mutableStateOf("")
    }
    val isStartedReading = remember {
        mutableStateOf(false)
    }

    val isFinishedReading = remember {
        mutableStateOf(false)
    }

    val ratingVal = remember {
        mutableStateOf(0)
    }


    SimpleForm(
        defaultValue = book.notes.toString().ifEmpty { "No thoughts Available" }
    ) {
        notesText.value = it
    }

    Row(
        modifier = Modifier.padding(4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        TextButton(
            onClick = { isStartedReading.value = true },
            enabled = book.startedReading == null
        ) {
            if (book.startedReading == null) {
                if (!isStartedReading.value) {
                    Text(text = "Started Reading")
                } else {
                    Text(
                        text = "Started Reading",
                        modifier = Modifier.alpha(0.06f),
                        color = Color.Red.copy(alpha = 0.5f)
                    )
                }
            } else {
                Text("Started On: ${book.startedReading?.let { formatDate(it) } ?: "Not Started"}")
            }
        }

        Spacer(modifier = Modifier.height(4.dp))
        TextButton(
            onClick = { isFinishedReading.value = true },
            enabled = book.finishedReading == null
        ) {
            if (book.finishedReading == null) {
                if (!isFinishedReading.value) {
                    Text(text = "Mark as Read")
                } else {
                    Text(
                        text = "Finished Reading!",
                        modifier = Modifier.alpha(0.06f),
                        color = Color.Red.copy(alpha = 0.5f)
                    )
                }
            } else {
                Text("Finished On: ${book.finishedReading?.let { formatDate(it) } ?: "Not Finished"}")
            }
        }
    }
    Text(text = "Rating", modifier = Modifier.padding(bottom = 3.dp))
    book.rating?.toInt()?.let {
        RatingBar(rating = it) { rating ->
            ratingVal.value = rating
            Log.d("TAG", "ShowSimpleForm: ${ratingVal.value}")
        }
    }

    Spacer(modifier = Modifier.padding(bottom = 15.dp))
    Row {

        val openDialog = remember {
            mutableStateOf(false)
        }

        val changedNotes = book.notes != notesText.value
        val changedRating = book.rating?.toInt() != ratingVal.value
        val isFinishedTimeStamp =
            if (isFinishedReading.value) Timestamp.now() else book.finishedReading
        val isStartedTimeStamp =
            if (isStartedReading.value) Timestamp.now() else book.startedReading

        val bookUpdate =
            changedNotes || changedRating || isStartedReading.value || isFinishedReading.value

        val bookToUpdate = hashMapOf(
            "finished_reading_at" to isFinishedTimeStamp,
            "started_reading_at" to isStartedTimeStamp,
            "rating" to ratingVal.value,
            "notes" to notesText.value
        ).toMap()

        if (openDialog.value) {
            // Perform Delete Book Operation on Delete button click
            ShowAlertDialog(
                title = stringResource(R.string.delete_book),
                message = stringResource(R.string.sure) + " \n " +
                        stringResource(id = R.string.action),
                openDialog = openDialog,
            ) {
                homeViewModel.deleteBookById(mBook = book) {
                    navController.navigate(ReaderScreens.HomeScreen.name)
                }
            }
        }

        RoundedButton("Update") {
            if (bookUpdate) {
                homeViewModel.updateBookById(mBook = book, bookToUpdate) {
                    showToast(context = context, "Book Updated Successfully!")
                    navController.navigate(ReaderScreens.HomeScreen.name)

                }
            }
        }

        Spacer(modifier = Modifier.width(100.dp))
        RoundedButton("Delete") {
            openDialog.value = true
        }
    }
}

@Composable
fun SimpleForm(
    modifier: Modifier = Modifier,
    defaultValue: String = "Great Book",
    onSearch: (String) -> Unit
) {
    Column {

        val textFieldValue = rememberSaveable { mutableStateOf(defaultValue) }
        val keyboardController = LocalSoftwareKeyboardController.current
        val valid = remember(textFieldValue.value) { textFieldValue.value.trim().isNotEmpty() }
        CommonInputField(
            modifier = modifier
                .fillMaxWidth()
                .height(140.dp)
                .padding(3.dp)
                .background(Color.White, CircleShape)
                .padding(horizontal = 20.dp, vertical = 12.dp),
            value = textFieldValue.value,
            isSingleLine = false,
            onValueChange = {
                textFieldValue.value = it
            },
            label = "Enter your thoughts",
            keyboardActions = KeyboardActions {
                if (!valid) return@KeyboardActions
                onSearch(textFieldValue.value)
                keyboardController?.hide()
            }
        )
    }
}

@Composable
fun ShowBookUpdate(bookInfo: MBook) {
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CardListItem(book = bookInfo, onPressDetails = {})

    }
}

@Composable
fun CardListItem(book: MBook, onPressDetails: () -> Unit) {

    Card(
        modifier = Modifier
            .padding(
                start = 4.dp,
                end = 4.dp,
                top = 4.dp,
                bottom = 8.dp
            )
            .clip(shape = RoundedCornerShape(20.dp))
            .clickable { },
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.background(color = Color.White)
        ) {
            AsyncImage(
                modifier = Modifier
                    .width(100.dp)
                    .height(120.dp)
                    .padding(4.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 120.dp, topEnd = 20.dp, bottomEnd = 0.dp, bottomStart = 0.dp
                        )
                    ),
                model = book.photoUrl.toString(),
                contentDescription = "Book Image",
            )

            Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                Text(
                    text = book.title.toString(),
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .width(120.dp),
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.titleLarge
                )

                Text(
                    text = book.authors.toString(),
                    modifier = Modifier.padding(
                        start = 8.dp,
                        end = 8.dp,
                        top = 2.dp,
                        bottom = 0.dp
                    ),
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = book.publishedDate.toString(),
                    modifier = Modifier.padding(
                        start = 8.dp,
                        end = 8.dp,
                        top = 0.dp,
                        bottom = 8.dp
                    ),
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.bodyMedium
                )
            }

        }
    }
}




