package dev.spozap.momentum.feature.onboarding.screens.personal_data

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.spozap.momentum.core.designsystem.components.MomentumTextInput
import dev.spozap.momentum.feature.onboarding.components.OnboardingLayout
import dev.spozap.momentum.feature.onboarding.screens.OnboardingPersonalDataState

@Composable
internal fun OnboardingPersonalDataScreen(
    state: OnboardingPersonalDataState,
    onUsernameChanged: (String) -> Unit,
    onEmailChanged: (String) -> Unit
) {
    OnboardingLayout(
        title = "Datos personales",
        subtitle = "Los siguientes datos son necesarios para identificar tu usuario"
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            // TODO: Add profile avatar
            MomentumTextInput(
                label = "Usuario",
                value = state.username,
                onValueChange = onUsernameChanged
            )
            MomentumTextInput(
                label = "Correo electrónico",
                value = state.email,
                onValueChange = onEmailChanged
            )
        }
    }
}