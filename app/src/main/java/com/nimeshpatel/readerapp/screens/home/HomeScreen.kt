package com.nimeshpatel.readerapp.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.nimeshpatel.readerapp.R
import com.nimeshpatel.readerapp.component.HorizontalScrollComponent
import com.nimeshpatel.readerapp.component.TitleSection
import com.nimeshpatel.readerapp.navigation.ReaderScreens

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */

@Composable
fun HomeScreen(
    navController: NavController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {

    Scaffold(
        topBar = {
            HomeAppBar(title = "A.Reader", navController = navController)
        },
        floatingActionButton = {
            FABContent {
                navController.navigate(ReaderScreens.SearchScreen.name)
            }
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = innerPadding)
        ) {
            HomeContent(navController, homeViewModel)
        }
    }
}

@Composable
fun FABContent(onTap: (String) -> Unit) {
    FloatingActionButton(
        onClick = {},
        shape = RoundedCornerShape(50),
        containerColor = Color(0xff92cbdf),
    ) {
        IconButton(onClick = {
            onTap("")
        }) {
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = "Add Book",
                tint = Color.White
            )
        }
    }

}

@Composable
fun HomeContent(navController: NavController, homeViewModel: HomeViewModel) {
    homeViewModel.fetchBookByUser()
    Column(
        modifier = Modifier.padding(2.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(modifier = Modifier.align(alignment = Alignment.Start)) {

            TitleSection(label = "Your reading \n" + "activity right now...")
            Spacer(modifier = Modifier.fillMaxWidth(fraction = 0.7f))
            Column {
                Icon(
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = null,
                    modifier = Modifier
                        .clickable {
                            navController.navigate(ReaderScreens.BookStatsScreen.name)

                        }
                        .size(32.dp),
                    tint = MaterialTheme.colorScheme.secondaryContainer
                )
                Text(
                    text = homeViewModel.currentUserName,
                    modifier = Modifier.padding(2.dp),
                    color = Color.Red,
                    fontSize = 15.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Clip
                )
                HorizontalDivider()
            }
        }
        ReadingRightNowArea(navController,homeViewModel)
        TitleSection(label = "Reading List")
        BookListArea(navController,homeViewModel)
    }
}

@Composable
fun BookListArea(navController: NavController, homeViewModel: HomeViewModel) {
    val addedBooks = homeViewModel.listOfBooks.filter { books ->
        books.startedReading == null && books.finishedReading == null
    }
    HorizontalScrollComponent(addedBooks) {
        navController.navigate(ReaderScreens.BookUpdateScreen.name + "/$it")
    }
}

@Composable
fun ReadingRightNowArea(navController: NavController, homeViewModel: HomeViewModel) {
   val readingList = homeViewModel.listOfBooks.filter { books->
       books.startedReading != null && books.finishedReading == null
   }

    HorizontalScrollComponent(readingList) {
        navController.navigate(ReaderScreens.BookUpdateScreen.name +"/$it")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeAppBar(title: String, showProfile: Boolean = true, navController: NavController) {
    TopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {

                if (showProfile) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_img),
                        contentDescription = "App Icon",
                        modifier = Modifier
                            .clip(
                                shape = RoundedCornerShape(corner = CornerSize(12.dp))
                            )
                            .scale(0.6f)
                    )
                    Text(
                        text = title,
                        color = Color.Red.copy(alpha = 0.7f),
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    )
                    Spacer(modifier = Modifier.width(150.dp))
                }
            }

        },
        actions = {

            IconButton(onClick = {
                FirebaseAuth.getInstance().signOut().run {
                    navController.navigate(ReaderScreens.LoginScreen.name)
                }
            }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_login_24),
                    contentDescription = "app icon",
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(corner = CornerSize(12.dp)))
                )
            }
        },
    )
}
