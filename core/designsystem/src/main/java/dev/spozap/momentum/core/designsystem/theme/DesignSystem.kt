package dev.spozap.momentum.core.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle

data class AppColors(
    val background: Color,
    val primary: Color,
    val onPrimary: Color,
    val secondary: Color,
    val onSecondary: Color,
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
        background = Color.Unspecified
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