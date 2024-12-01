package com.nimeshpatel.readerapp.screens.details

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.core.text.HtmlCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.nimeshpatel.readerapp.component.RoundedButton
import com.nimeshpatel.readerapp.model.Item
import com.nimeshpatel.readerapp.utils.Resource

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@Composable
fun BookDetailScreen(
    navController: NavController,
    bookId: String = "",
    bookDetailViewModel: BookDetailViewModel = hiltViewModel()
) {
    val bookInfo = produceState<Resource<Item>>(initialValue = Resource.Loading()) {
        value = bookDetailViewModel.getBookInfo(bookId)
    }.value
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(3.dp)
    ) {
        Column(
            modifier = Modifier.padding(top = 12.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ShowBookDetails(navController, bookInfo, bookDetailViewModel)
        }
    }
}

@Composable
fun ShowBookDetails(
    navController: NavController,
    bookInfo: Resource<Item>,
    bookDetailViewModel: BookDetailViewModel
) {
    val context = LocalContext.current
    val bookData = bookInfo.data?.volumeInfo
    val googleBookId = bookInfo.data?.id

    Card(
        modifier = Modifier.padding(34.dp),
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        AsyncImage(
            modifier = Modifier
                .width(90.dp)
                .height(90.dp)
                .padding(1.dp),
            model = bookData?.imageLinks?.thumbnail ?: "",
            contentDescription = "Book Image",
        )
    }
    Text(
        text = bookData?.title ?: "",
        maxLines = 19,
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.headlineMedium
    )

    Text(text = "Authors: ${bookData?.authors?.toString()}")
    Text(text = "Page Count: ${bookData?.pageCount}")
    Text(
        text = "Categories: ${bookData?.categories}",
        style = MaterialTheme.typography.bodySmall
    )
    Text(
        text = "Published: ${bookData?.publishedDate}",
        style = MaterialTheme.typography.bodySmall
    )
    Spacer(modifier = Modifier.height(5.dp))

    val localDims = LocalContext.current.resources.displayMetrics
    Surface(
        modifier = Modifier
            .height(localDims.heightPixels.dp.times(0.09f))
            .padding(4.dp),
        shape = RectangleShape,
        border = BorderStroke(1.dp, Color.Gray)
    ) {
        LazyColumn(modifier = Modifier.padding(3.dp)) {
            item {
                val cleanText = HtmlCompat.fromHtml(
                    bookData?.description.toString(),
                    HtmlCompat.FROM_HTML_MODE_LEGACY
                ).toString()
                Text(
                    text = cleanText,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }
    }

    Row(
        modifier = Modifier.padding(top = 6.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        RoundedButton(label = "Save") {
            bookDetailViewModel.saveBookInfo(bookData,googleBookId){
                Toast.makeText(context,it,Toast.LENGTH_SHORT).show()
                navController.popBackStack()
            }
        }

        Spacer(modifier = Modifier.width(25.dp))

        RoundedButton(label = "Cancel") {
            navController.popBackStack()
        }
    }


}
