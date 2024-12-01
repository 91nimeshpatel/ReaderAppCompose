package com.nimeshpatel.readerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nimeshpatel.readerapp.screens.details.BookDetailScreen
import com.nimeshpatel.readerapp.screens.home.HomeScreen
import com.nimeshpatel.readerapp.screens.login.LoginScreen
import com.nimeshpatel.readerapp.screens.search.SearchScreen
import com.nimeshpatel.readerapp.screens.splash.SplashScreen
import com.nimeshpatel.readerapp.screens.stats.BookStatusScreen

/**
 * Created by Nimesh Patel on 21-Nov-24.
 * Purpose:
 */
@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = ReaderScreens.SplashScreen.name
    ) {

        composable(ReaderScreens.SplashScreen.name){
            SplashScreen(navController = navController
            )
        }

        composable(ReaderScreens.LoginScreen.name){
            LoginScreen(navController = navController
            )
        }
        composable(ReaderScreens.HomeScreen.name){
            HomeScreen(navController = navController
            )
        }
        composable(ReaderScreens.SearchScreen.name){
            SearchScreen(navController = navController
            )
        }
        composable(ReaderScreens.BookDetailScreen.name){
            BookDetailScreen(navController = navController
            )
        }
        composable(ReaderScreens.BookStatsScreen.name){
            BookStatusScreen(navController = navController
            )
        }
        composable(ReaderScreens.BookUpdateScreen.name){
            BookDetailScreen(navController = navController
            )
        }

    }
}