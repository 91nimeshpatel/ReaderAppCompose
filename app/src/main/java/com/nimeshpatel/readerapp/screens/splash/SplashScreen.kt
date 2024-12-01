package com.nimeshpatel.readerapp.screens.splash


import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import com.nimeshpatel.readerapp.component.ReaderLogo
import com.nimeshpatel.readerapp.navigation.ReaderScreens
import kotlinx.coroutines.delay

/**
 * Created by Nimesh Patel on 21-Nov-24.
 * Purpose:
 */
@Composable
fun SplashScreen(navController: NavController = rememberNavController()) {

    val scale = remember { Animatable(0f) }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.9f, animationSpec = tween(durationMillis = 800,
                easing = {
                    OvershootInterpolator(8f).getInterpolation(it)
                })
        )
        delay(2000L)

        if(FirebaseAuth.getInstance().currentUser?.email.isNullOrEmpty())
            navController.navigate(ReaderScreens.LoginScreen.name)
        else navController.navigate(ReaderScreens.HomeScreen.name)
    }

    SplashView(navController,scale)
    
}
@Composable
fun SplashView(navController: NavController, scale: Animatable<Float, AnimationVector1D>) {

    Surface(
        modifier = Modifier
            .size(330.dp)
            .scale(scale = scale.value),
        shape = CircleShape,
        border =  BorderStroke(width = 2.dp, color =  Color.LightGray),
        color = Color.White
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            ReaderLogo()
            Text(
                text = "\"Read. Change. YourSelf\"",
                color = Color.LightGray,
                style = MaterialTheme.typography.titleMedium
            )
        }

    }

}