package dev.spozap.momentum.feature.onboarding.screens.welcome

import androidx.compose.runtime.Composable
import dev.spozap.momentum.feature.onboarding.components.OnboardingLayout

@Composable
internal fun OnboardingWelcomeRoute() {
    OnboardingLayout(
        title = "Bienvenido a Momentum",
        subtitle = "La aplicación que te ayudará a guardar tu progreso en el gimnasio"
    ) { }
}