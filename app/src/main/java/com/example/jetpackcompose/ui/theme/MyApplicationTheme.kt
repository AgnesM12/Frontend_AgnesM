package com.example.jetpackcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.material3.ColorScheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val LightColorPalette = lightColors(
    primary = Color.Blue, // Sesuaikan dengan warna yang Anda inginkan
    primaryVariant = Color.Blue, // Sesuaikan dengan warna yang Anda inginkan
    secondary = Color.Green, // Sesuaikan dengan warna yang Anda inginkan
)

private val DarkColorPalette = darkColors(
    primary = Color.Blue, // Sesuaikan dengan warna yang Anda inginkan
    primaryVariant = Color.Blue, // Sesuaikan dengan warna yang Anda inginkan
    secondary = Color.Green, // Sesuaikan dengan warna yang Anda inginkan
)


@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors, // Tambahkan colors ke MaterialThem
        content = content
    )
}
