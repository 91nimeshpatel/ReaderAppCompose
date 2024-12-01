package com.nimeshpatel.readerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nimeshpatel.readerapp.screens.splash.ReaderSplashScreen

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
            ReaderSplashScreen(navController = navController)
        }
    }
}