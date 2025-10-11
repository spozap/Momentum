package dev.spozap.momentum.core.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import dev.spozap.momentum.core.designsystem.theme.AppTheme

@Composable
fun AppScaffold(
    backgroundColor: Color = AppTheme.colorScheme.background,
    content: @Composable () -> Unit
) {
    Scaffold { scaffoldPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(backgroundColor)
                .padding(scaffoldPadding),
        ) {
            content()
        }
    }
}