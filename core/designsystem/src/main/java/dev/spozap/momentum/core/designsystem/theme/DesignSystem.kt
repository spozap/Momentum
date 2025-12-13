package dev.spozap.momentum.core.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle

data class AppColors(
    val primary: Color,
    val onPrimary: Color,

    val secondary: Color,
    val onSecondary: Color,

    val background: Color,
    val onBackground: Color,

    val surface: Color,
    val onSurface: Color,

    val surfaceVariant: Color,
    val onSurfaceVariant: Color,

    val outline: Color,

    val error: Color,
    val onError: Color,

    val disabled: Color,
    val onDisabled: Color
)

data class AppTypography(
    val titleLarge: TextStyle,
    val bodyLarge: TextStyle,
    val labelMedium: TextStyle
)

data class AppShapes(
    val buttonSmall: Shape
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        onPrimary = Color.Unspecified,
        secondary = Color.Unspecified,
        onSecondary = Color.Unspecified,
        disabled = Color.Unspecified,
        onDisabled = Color.Unspecified,
        background = Color.Unspecified,
        onSurface = Color.Unspecified,
        onSurfaceVariant = Color.Unspecified,
        surface = Color.Unspecified,
        surfaceVariant = Color.Unspecified,
        onError = Color.Unspecified,
        error = Color.Unspecified,
        outline = Color.Unspecified,
        onBackground = Color.Unspecified
    )
}

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        titleLarge = TextStyle.Default,
        bodyLarge = TextStyle.Default,
        labelMedium = TextStyle.Default
    )
}

val LocalAppShapes = staticCompositionLocalOf {
    AppShapes(
        buttonSmall = RoundedCornerShape(ShapeSizes.smallRadius)
    )
}