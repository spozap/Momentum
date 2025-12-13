package dev.spozap.momentum.feature.onboarding.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import dev.spozap.momentum.core.designsystem.theme.AppTheme

@Composable
internal fun OnboardingLayout(
    title: String,
    subtitle: String,
    content: @Composable ColumnScope.() -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = title,
                style = AppTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                color = AppTheme.colorScheme.primary
            )
        }
        item {
            Text(
                text = subtitle,
                style = AppTheme.typography.labelMedium,
                fontWeight = FontWeight.SemiBold,
                color = AppTheme.colorScheme.onSecondary
            )
        }

        item {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Spacer(modifier = Modifier.size(8.dp))
                content()
            }
        }
    }
}