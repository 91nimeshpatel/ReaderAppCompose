package com.nimeshpatel.readerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.nimeshpatel.readerapp.screens.details.BookDetailScreen
import com.nimeshpatel.readerapp.screens.home.HomeScreen
import com.nimeshpatel.readerapp.screens.login.LoginScreen
import com.nimeshpatel.readerapp.screens.search.SearchScreen
import com.nimeshpatel.readerapp.screens.splash.SplashScreen
import com.nimeshpatel.readerapp.screens.stats.BookStatusScreen
import com.nimeshpatel.readerapp.screens.update.BookUpdateScreen

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

        composable(ReaderScreens.SplashScreen.name) {
            SplashScreen(
                navController = navController
            )
        }

        composable(ReaderScreens.LoginScreen.name) {
            LoginScreen(
                navController = navController
            )
        }
        composable(ReaderScreens.HomeScreen.name) {
            HomeScreen(
                navController = navController
            )
        }
        composable(ReaderScreens.SearchScreen.name) {
            SearchScreen(
                navController = navController
            )
        }
        composable("${ReaderScreens.BookDetailScreen.name}/{bookId}", arguments = listOf(
            navArgument("bookId") { type = NavType.StringType }
        )) { backStackEntry ->
            backStackEntry.arguments?.getString("bookId").let {
                BookDetailScreen(
                    navController = navController,
                    bookId = it.toString()
                )
            }
        }
        composable(ReaderScreens.BookStatsScreen.name) {
            BookStatusScreen(
                navController = navController
            )
        }
        composable(route = "${ReaderScreens.BookUpdateScreen.name}/{bookItemId}",
            arguments = listOf(
                navArgument("bookItemId"){
                    type = NavType.StringType
                }
            )
        ) {backStackEntry ->
            backStackEntry.arguments?.getString("bookItemId").let {
                BookUpdateScreen(
                    navController = navController,
                    bookItemId =it.toString()
                )
            }
        }

    }
}