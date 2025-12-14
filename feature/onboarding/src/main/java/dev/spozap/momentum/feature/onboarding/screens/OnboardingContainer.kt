package dev.spozap.momentum.feature.onboarding.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.spozap.momentum.core.designsystem.components.AppScaffold
import dev.spozap.momentum.core.designsystem.components.MomentumButton
import dev.spozap.momentum.core.designsystem.theme.AppTheme
import dev.spozap.momentum.feature.onboarding.navigation.OnboardingPersonalDataRoute
import dev.spozap.momentum.feature.onboarding.navigation.OnboardingTrainingDataRoute
import dev.spozap.momentum.feature.onboarding.navigation.OnboardingWelcomeRoute
import dev.spozap.momentum.feature.onboarding.navigation.navigateToOnboardingTrainingData
import dev.spozap.momentum.feature.onboarding.navigation.navigateToOnboardingUsername
import dev.spozap.momentum.feature.onboarding.screens.personal_data.OnboardingPersonalDataScreen
import dev.spozap.momentum.feature.onboarding.screens.training_data.OnboardingTrainingDataScreen
import dev.spozap.momentum.feature.onboarding.screens.welcome.OnboardingWelcomeRoute

@Composable
internal fun OnboardingContainer(
    navController: NavHostController = rememberNavController(),
    viewModel: OnboardingViewModel = hiltViewModel()
) {

    val backStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry.value?.destination?.route
    val showBackButton =
        currentRoute?.let { it != OnboardingWelcomeRoute::class.qualifiedName } ?: false

    val onboardingState = viewModel.state.collectAsStateWithLifecycle().value

    AppScaffold {
        Column(modifier = Modifier.padding(8.dp)) {
            Box(modifier = Modifier.weight(1f)) {
                NavHost(
                    navController = navController,
                    startDestination = OnboardingWelcomeRoute,
                    enterTransition = {
                        slideInHorizontally(
                            initialOffsetX = { it },
                            animationSpec = tween(300)
                        )
                    },
                    exitTransition = {
                        slideOutHorizontally(
                            targetOffsetX = { -it },
                            animationSpec = tween(300)
                        )
                    },
                    popEnterTransition = {
                        slideInHorizontally(
                            initialOffsetX = { -it },
                            animationSpec = tween(300)
                        )
                    },
                    popExitTransition = {
                        slideOutHorizontally(
                            targetOffsetX = { it },
                            animationSpec = tween(300)
                        )
                    }
                ) {
                    composable<OnboardingWelcomeRoute> {
                        OnboardingWelcomeRoute()
                    }
                    composable<OnboardingPersonalDataRoute> {
                        OnboardingPersonalDataScreen(
                            state = onboardingState.personalData,
                            onUsernameChanged = viewModel::updateUsername,
                            onEmailChanged = viewModel::updateEmail
                        )
                    }
                    composable<OnboardingTrainingDataRoute> {
                        OnboardingTrainingDataScreen(
                            state = onboardingState.trainingData,
                            onTrainingGoalChanged = viewModel::updateTrainingGoal
                        )
                    }
                }
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                AnimatedVisibility(showBackButton) {
                    MomentumButton(
                        modifier = Modifier.fillMaxWidth(.5f),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = AppTheme.colorScheme.onSurface,
                        ),
                        onClick = { navController.popBackStack() }) {
                        Text("Atrás", style = AppTheme.typography.labelMedium)
                    }
                }
                MomentumButton(
                    modifier = Modifier.weight(1f),
                    onClick = {
                        handleOnboardingStep(
                            navController = navController,
                            currentRoute = currentRoute,
                            onSubmit = viewModel::submit
                        )
                    }) {
                    Text("Siguiente", style = AppTheme.typography.labelMedium)
                }
            }
        }
    }
}

private fun handleOnboardingStep(
    navController: NavHostController,
    currentRoute: String?,
    onSubmit: () -> Unit
) {
    when (currentRoute) {
        OnboardingWelcomeRoute::class.qualifiedName -> {
            navController.navigateToOnboardingUsername()
        }

        OnboardingPersonalDataRoute::class.qualifiedName -> {
            navController.navigateToOnboardingTrainingData()
        }

        OnboardingTrainingDataRoute::class.qualifiedName -> {
            onSubmit()
        }
    }
}