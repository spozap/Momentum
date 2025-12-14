package dev.spozap.momentum.feature.onboarding.screens.personal_data

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import dev.spozap.momentum.feature.onboarding.screens.OnboardingPersonalDataState
import org.junit.Rule
import org.junit.Test

class OnboardingPersonalDataScreenTest {

    @get:Rule
    val composeRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun screen_shows_onboardingLayout() {
        composeRule.setContent {
            OnboardingPersonalDataScreen(
                state = OnboardingPersonalDataState(),
                onUsernameChanged = {},
                onEmailChanged = {}
            )
        }

        composeRule.onNodeWithTag("onboardingLayout").assertExists()
    }

}