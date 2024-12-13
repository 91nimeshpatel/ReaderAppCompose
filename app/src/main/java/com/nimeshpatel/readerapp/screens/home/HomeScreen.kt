package com.nimeshpatel.readerapp.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.nimeshpatel.readerapp.R
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
        Surface(modifier = Modifier.fillMaxSize().padding(paddingValues = innerPadding)) {
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
