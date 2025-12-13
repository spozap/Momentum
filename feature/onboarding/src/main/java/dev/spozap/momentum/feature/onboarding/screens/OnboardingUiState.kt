package dev.spozap.momentum.feature.onboarding.screens

import dev.spozap.momentum.core.model.training.TrainingGoal

data class OnboardingState(
    val personalData: OnboardingPersonalDataState = OnboardingPersonalDataState(),
    val trainingData: OnboardingTrainingDataState = OnboardingTrainingDataState()
)

data class OnboardingPersonalDataState(
    val username: String = "",
    val email: String = "",
)

data class OnboardingTrainingDataState(
    val trainingDays: Int = 3,
    val trainingGoal: TrainingGoal = TrainingGoal.Strength
)