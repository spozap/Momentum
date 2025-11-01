package dev.spozap.momentum.feature.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import dev.spozap.momentum.core.designsystem.theme.AppTheme

@Composable
internal fun UserGreeting(username: String) {
    Column {
        Text(
            "Welcome back!",
            style = AppTheme.typography.bodyLarge,
            color = AppTheme.colorScheme.secondary
        )
        Text(username, style = AppTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
    }
}