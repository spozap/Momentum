package dev.spozap.momentum.feature.onboarding.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import dev.spozap.momentum.feature.onboarding.screens.OnboardingContainer
import kotlinx.serialization.Serializable

@Serializable
data object OnboardingGraph

// Routes used in OnboardingContainer
@Serializable
internal data object OnboardingWelcomeScreen

@Serializable
internal data object OnboardingUsernameScreen

fun NavGraphBuilder.onboardingGraph() {
    composable<OnboardingGraph> {
        OnboardingContainer()
    }
}

internal fun NavController.navigateToOnboardingUsername() = navigate(OnboardingUsernameScreen) {
    launchSingleTop = true
}