package dev.spozap.momentum.navigation

import android.annotation.SuppressLint
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import dev.spozap.momentum.feature.home.navigation.homeScreen
import dev.spozap.momentum.feature.onboarding.navigation.OnboardingGraph
import dev.spozap.momentum.feature.onboarding.navigation.onboardingGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
internal fun AppNavHost(navHostController: NavHostController) {


    SharedTransitionLayout {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            NavHost(
                navController = navHostController,
                startDestination = OnboardingGraph,
                modifier = Modifier.fillMaxSize()
            ) {
                onboardingGraph()
                homeScreen()
            }

        }
    }
}
