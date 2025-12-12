package dev.spozap.momentum.feature.onboarding.screens.username

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import dev.spozap.momentum.core.designsystem.theme.AppTheme

@Composable
internal fun OnboardingUsernameRoute() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Introduce tu usuario",
            style = AppTheme.typography.titleLarge,
            fontWeight = FontWeight.SemiBold,
            color = AppTheme.colorScheme.primary,
        )
    }
}