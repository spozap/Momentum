package dev.spozap.momentum.core.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun MomentumTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (isDarkTheme) darkColorScheme else lightColorScheme

    CompositionLocalProvider(
        LocalAppColors provides colorScheme,
        content = content
    )

}

object AppTheme {
    val colorScheme: AppColors
        @Composable get() = LocalAppColors.current
}