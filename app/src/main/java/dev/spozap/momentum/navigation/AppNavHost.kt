package dev.spozap.momentum.navigation

import android.annotation.SuppressLint
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import dev.spozap.momentum.core.ui.bottombar.BottomBar
import dev.spozap.momentum.feature.home.navigation.HomeRoute
import dev.spozap.momentum.feature.home.navigation.homeScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
internal fun AppNavHost(navHostController: NavHostController) {

    var selectedItem by remember { mutableIntStateOf(0) }

    SharedTransitionLayout {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            NavHost(
                navController = navHostController,
                startDestination = HomeRoute,
                modifier = Modifier.fillMaxSize()
            ) {
                homeScreen()
            }

            BottomBar(
                selectedItem = selectedItem,
                onItemSelected = { selectedItem = it }
            )

        }
    }
}
