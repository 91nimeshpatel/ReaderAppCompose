package com.nimeshpatel.readerapp.component

import android.content.Context
import android.view.MotionEvent
import android.widget.Toast
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.nimeshpatel.readerapp.model.MBook

/**
 * Created by Nimesh Patel on 19-Dec-24.
 * Purpose:
 */

@Preview
@Composable
fun RoundedButton(
    label: String = "label",
    radius: Int = 29,
    onPress: () -> Unit = {}
) {
    Surface(
        modifier = Modifier
            .clip(RoundedCornerShape(bottomEndPercent = radius, topStartPercent = radius)),
        color = Color(0xff92cbdf)
    ) {
        Column(
            modifier = Modifier
                .width(90.dp)
                .heightIn(40.dp)
                .clickable {
                    onPress.invoke()
                },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = label,
                style = TextStyle(color = Color.White, fontSize = 15.sp)
            )
        }
    }
}

@Composable
fun TitleSection(
    modifier: Modifier = Modifier,
    label: String
) {
    Surface(modifier = modifier.padding(start = 5.dp, top = 1.dp)) {
        Column {
            Text(
                text = label,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Left,
                fontSize = 19.sp
            )
        }
    }
}

@Composable
fun HorizontalScrollComponent(books: List<MBook>, onCardPress: (String) -> Unit) {
    val scrollState = rememberScrollState()

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .horizontalScroll(scrollState)
    ) {

        if (books.isEmpty()) {
            Surface(modifier = Modifier.padding(15.dp)) {
                Text(
                    text = "No Books Found. Add a Book",
                    style = TextStyle(
                        color = Color.Red.copy(alpha = 0.4f),
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                )
            }
        } else {
            books.forEach { book ->
                ListCard(mBook = book) {
                    onCardPress.invoke(book.googleBookId ?: "")
                }
            }
        }

    }
}

@Composable
fun ListCard(
    mBook: MBook,
    onPress: (String) -> Unit
) {

    val context = LocalContext.current
    val resource = context.resources
    val displayMetrics = resource.displayMetrics
    val screenWidth = displayMetrics.widthPixels / displayMetrics.density
    val spacing = 10.dp
    Card(
        shape = RoundedCornerShape(29.dp),
        colors = CardDefaults.cardColors().copy(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        modifier = Modifier
            .padding(5.dp)
            .height(200.dp)
            .width(175.dp)
            .clickable {
                onPress.invoke(mBook.title ?: "NA")
            }
    ) {
        Column(
            modifier = Modifier.width(screenWidth.dp - (spacing * 2)),
            horizontalAlignment = Alignment.Start,
            content = {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    AsyncImage(
                        model = mBook.photoUrl,
                        contentDescription = "Book Photo",
                        modifier = Modifier
                            .height(110.dp)
                            .width(100.dp)
                            .padding(4.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column(
                        modifier = Modifier.padding(10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Favourite",
                            modifier = Modifier.padding(bottom = 1.dp)
                        )

                        BookRating(score = mBook.rating ?: 0.0f)
                    }
                }
                Text(
                    text = mBook.title ?: "",
                    modifier = Modifier.padding(4.dp),
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = mBook.authors ?: "",
                    modifier = Modifier.padding(4.dp),
                    style = MaterialTheme.typography.labelSmall
                )
            })
        val isStartReading = remember {
            mutableStateOf(false)
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            isStartReading.value = mBook.startedReading != null

            Spacer(
                modifier = Modifier.padding(end = 12.dp)
            )

            RoundedButton(
                label = if (isStartReading.value) "Reading" else "Not Started",
                radius = 70
            )
        }

    }

}

@Composable
fun BookRating(score: Number) {
    Surface(
        modifier = Modifier
            .height(70.dp)
            .padding(4.dp),
        shape = RoundedCornerShape(56),
        shadowElevation = 4.dp,
        tonalElevation = 4.dp,
        color = Color.White
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                modifier = Modifier.padding(3.dp)
            )
            Text(text = score.toString(), style = MaterialTheme.typography.labelMedium)
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Int,
    onPressRating: (Int) -> Unit
) {
    var ratingState = remember {
        mutableIntStateOf(rating)
    }
    var selected = remember {
        mutableStateOf(false)
    }

    val size = animateDpAsState(
        targetValue = if (selected.value) 42.dp else 34.dp,
        spring(Spring.DampingRatioMediumBouncy)
    )


    Row(
        modifier = Modifier.width(200.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        for (i in 1..5) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "Star",
                modifier = Modifier
                    .width(size.value)
                    .height(size.value)
                    .pointerInteropFilter {
                        when (it.action) {
                            MotionEvent.ACTION_DOWN -> {
                                selected.value = true
                                onPressRating(i)
                                ratingState.value = i
                            }

                            MotionEvent.ACTION_UP -> {
                                selected.value = true
                            }
                        }
                        true
                    },
                tint = if (i <= ratingState.value) Color(0xFFFFD700) else Color(0xFFA2ADB1)

            )
        }
    }

}

@Composable
fun ShowAlertDialog(
    title: String,
    message: String,
    openDialog: MutableState<Boolean>,
    onYesPress: () -> Unit
) {
    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = { openDialog.value = false },
            title = {
                Text(text = title)
            },
            text = {
                Text(text = message)
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        onYesPress.invoke()
                        openDialog.value = false
                    }
                ) {
                    Text(text = "Yes")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = { openDialog.value = false }
                ) {
                    Text(text = "No")
                }
            }
        )
    }
}

fun showToast(context: Context, msg: String) {
    Toast.makeText(context, msg, Toast.LENGTH_LONG)
        .show()
}
