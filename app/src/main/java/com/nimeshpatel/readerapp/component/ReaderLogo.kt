package com.nimeshpatel.readerapp.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@Preview
@Composable
fun ReaderLogo(modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier.padding(bottom = 10.dp),
        text = "A. Reader",
        style = MaterialTheme.typography.headlineLarge,
        fontWeight = FontWeight.Medium,
        color = Color.Red.copy(alpha = 0.5f)
        )
}