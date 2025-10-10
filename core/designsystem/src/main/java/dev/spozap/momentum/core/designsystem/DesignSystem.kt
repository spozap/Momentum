package dev.spozap.momentum.core.designsystem

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class AppColors(
    val background: Color,
    val primary: Color,
    val onPrimary: Color,
    val secondary: Color,
    val onSecondary: Color,
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        onPrimary = Color.Unspecified,
        secondary = Color.Unspecified,
        onSecondary = Color.Unspecified,
        background = Color.Unspecified
    )
}