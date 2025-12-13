package dev.spozap.momentum.feature.onboarding.screens.training_data

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.spozap.momentum.core.designsystem.theme.AppTheme
import dev.spozap.momentum.core.model.training.TrainingGoal
import dev.spozap.momentum.core.ui.Chip
import dev.spozap.momentum.core.ui.mappers.localizedLabel
import dev.spozap.momentum.feature.onboarding.components.OnboardingLayout
import dev.spozap.momentum.feature.onboarding.screens.OnboardingTrainingDataState

@Composable
internal fun OnboardingTrainingDataScreen(
    state: OnboardingTrainingDataState,
    onTrainingGoalChanged: (TrainingGoal) -> Unit
) {
    OnboardingLayout(
        title = "Datos de entreno",
        subtitle = "Introduce tu experiencia haciendo ejercicio"
    ) {
        Text(
            text = "Introduce tu objetivo",
            style = AppTheme.typography.labelMedium,
            color = AppTheme.colorScheme.onSecondary
        )
        Spacer(modifier = Modifier.height(8.dp))
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TrainingGoal.entries.map {
                Chip(
                    label = it.localizedLabel(),
                    selected = state.trainingGoal == it,
                    onClick = { onTrainingGoalChanged(it) }
                )
            }
        }
    }
}