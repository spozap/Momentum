package dev.spozap.momentum.feature.onboarding.screens.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import dev.spozap.momentum.core.designsystem.theme.AppTheme

@Composable
internal fun OnboardingWelcomeRoute() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Bienvenido a Momentum",
            style = AppTheme.typography.titleLarge,
            fontWeight = FontWeight.SemiBold,
            color = AppTheme.colorScheme.primary,
        )
        Text(
            "La aplicación que te ayudará a guardar tu progreso en el gimnasio",
            style = AppTheme.typography.labelMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center
        )
    }
}