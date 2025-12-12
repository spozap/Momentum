package dev.spozap.momentum.core.designsystem.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.spozap.momentum.core.designsystem.R

internal val Exo2 = FontFamily(
    Font(R.font.exo2_regular, FontWeight.Normal),
    Font(R.font.exo2_medium, FontWeight.Medium),
    Font(R.font.exo2_semibold, FontWeight.SemiBold),
    Font(R.font.exo2_bold, FontWeight.Bold)
)

internal val typography = AppTypography(
    bodyLarge = TextStyle(
        fontSize = 20.sp,
        fontFamily = Exo2,
    ),
    titleLarge = TextStyle(
        fontSize = 24.sp,
        fontFamily = Exo2
    ),
    labelMedium = TextStyle(
        fontSize = 18.sp,
        fontFamily = Exo2,
        fontWeight = FontWeight.Normal
    )
)