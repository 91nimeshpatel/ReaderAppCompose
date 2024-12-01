package com.nimeshpatel.readerapp.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.nimeshpatel.readerapp.navigation.ReaderScreens


/**
 * Created by Nimesh Patel on 08-Dec-24.
 * Purpose:
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReaderAppBar(
    title: String,
    icon: ImageVector? = null,
    showProfile: Boolean = true,
    elevation: Dp = 0.dp,
    navController: NavController,
    auth: FirebaseAuth? = null,
    onBackPress: () -> Unit,
) {
    TopAppBar(
        title = {

            Row {
                if (icon != null) {
                    Icon(imageVector = icon, contentDescription = "logo",
                        tint = Color.Red.copy(alpha = 0.7f),
                        modifier = Modifier.clickable {
                            onBackPress.invoke()
                        })
                }
                val screenWidth = LocalContext.current.resources.displayMetrics.widthPixels

                Text(
                    text = title,
                    modifier = Modifier.padding(
                        start = screenWidth.dp.times(0.08f),
                        bottom = 19.dp
                    ),
                    color = Color.Red.copy(alpha = 0.7f),
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp)
                )
            }

        },
        actions = {

            IconButton(
                onClick = {
                    auth?.signOut().run {
                        navController.navigate(ReaderScreens.LoginScreen.name)
                    }
                }
            ) {
                if (showProfile) {
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                        Column {
                            Icon(
                                Icons.Filled.AccountCircle,
                                contentDescription = null
                            )
                            Text(
                                "P.D",
                                modifier = Modifier.padding(2.dp),
                                style = MaterialTheme.typography.displayMedium,
                                color = Color.Red
                            )
                            Icon(imageVector = Icons.Filled.ChevronRight,
                                contentDescription = "Arrow Right",
                                modifier = Modifier.clickable { })
                        }

                    }
                } else Surface() { }
            }

        },
        modifier = Modifier.shadow(elevation = elevation)
    )

}