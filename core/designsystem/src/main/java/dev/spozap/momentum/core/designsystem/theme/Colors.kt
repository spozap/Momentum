package dev.spozap.momentum.core.designsystem.theme

import androidx.compose.ui.graphics.Color

internal val lightColorScheme = AppColors(
    primary = Color(0xFF7C2AE8),      // violeta energía
    onPrimary = Color.White,

    secondary = Color(0xFF2ED1B2),    // verde menta fitness
    onSecondary = Color(0xFF00382F),

    background = Color(0xFFF9F7FC),   // blanco con tinte violeta
    onBackground = Color(0xFF1C1B1F),

    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF1C1B1F),

    surfaceVariant = Color(0xFFF1ECF8),
    onSurfaceVariant = Color(0xFF4A4458),

    outline = Color(0xFFD0C7E2),

    error = Color(0xFFB3261E),
    onError = Color.White,

    disabled = Color(0xFFE4E0EC),
    onDisabled = Color(0xFF9A96A3)
)

internal val darkColorScheme = AppColors(
    primary = Color(0xFFB58CFF),      // violeta claro energético
    onPrimary = Color(0xFF2B0052),

    secondary = Color(0xFF5FEAD2),
    onSecondary = Color(0xFF00382F),

    background = Color(0xFF121015),   // oscuro con tinte púrpura
    onBackground = Color(0xFFE6E1E6),

    surface = Color(0xFF1A1820),
    onSurface = Color(0xFFE6E1E6),

    surfaceVariant = Color(0xFF26232E),
    onSurfaceVariant = Color(0xFFC9C4D0),

    outline = Color(0xFF4F4A5E),

    error = Color(0xFFF2B8B5),
    onError = Color(0xFF601410),

    disabled = Color(0xFF2E2B36),
    onDisabled = Color(0xFF7F7A8A)
)