package dev.spozap.momentum.feature.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import dev.spozap.momentum.core.designsystem.components.AppScaffold
import dev.spozap.momentum.feature.home.components.UserGreeting


@Composable
internal fun HomeRoute() {
    HomeScreenContent()
}

@Composable
private fun HomeScreenContent() {
    AppScaffold {
        LazyColumn {
            item {
                UserGreeting("Sergi Poza")
            }
        }
    }
}