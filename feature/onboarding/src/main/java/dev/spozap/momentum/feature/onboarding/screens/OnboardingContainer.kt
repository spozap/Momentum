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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.spozap.momentum.core.designsystem.components.AppScaffold
import dev.spozap.momentum.core.designsystem.components.MomentumPrimaryButton
import dev.spozap.momentum.core.designsystem.theme.AppTheme
import dev.spozap.momentum.feature.onboarding.navigation.OnboardingUsernameScreen
import dev.spozap.momentum.feature.onboarding.navigation.OnboardingWelcomeScreen
import dev.spozap.momentum.feature.onboarding.screens.username.OnboardingUsernameRoute
import dev.spozap.momentum.feature.onboarding.screens.welcome.OnboardingWelcomeRoute

@Composable
internal fun OnboardingContainer(
    navController: NavHostController = rememberNavController()
) {

    val backStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry.value?.destination?.route
    val showBackButton = currentRoute != OnboardingWelcomeScreen::class.qualifiedName

    AppScaffold {
        Column(modifier = Modifier.padding(8.dp)) {
            Box(modifier = Modifier.weight(1f)) {
                NavHost(
                    navController = navController,
                    startDestination = OnboardingWelcomeScreen,
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
                    composable<OnboardingWelcomeScreen> {
                        OnboardingWelcomeRoute()
                    }
                    composable<OnboardingUsernameScreen> {
                        OnboardingUsernameRoute()
                    }
                }
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                AnimatedVisibility(showBackButton) {
                    MomentumPrimaryButton(onClick = {
                        navController.popBackStack()
                    }, modifier = Modifier.fillMaxWidth(.5f)) {
                        Text("Atrás", style = AppTheme.typography.labelMedium)
                    }
                }
                MomentumPrimaryButton(
                    modifier = Modifier.weight(1f),
                    onClick = {
                        navController.navigate(OnboardingUsernameScreen)
                    }) {
                    Text("Siguiente", style = AppTheme.typography.labelMedium)
                }
            }
        }
    }
}