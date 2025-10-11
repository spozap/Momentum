package dev.spozap.momentum.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import dev.spozap.momentum.feature.home.navigation.HomeRoute
import dev.spozap.momentum.feature.home.navigation.homeScreen

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
internal fun AppNavHost(navHostController: NavHostController) {
    SharedTransitionLayout {
        NavHost(
            navController = navHostController,
            startDestination = HomeRoute
        ) {
            homeScreen()
        }
    }
}