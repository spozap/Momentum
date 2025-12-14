package dev.spozap.momentum.feature.onboarding.screens

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.spozap.momentum.core.model.training.TrainingGoal
import dev.spozap.momentum.core.model.user.User
import dev.spozap.momentum.data.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnboardingViewModel @Inject constructor(
    private val userRepository: UserRepository,
    val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state: MutableStateFlow<OnboardingState> = MutableStateFlow(
        OnboardingState(
            personalData = OnboardingPersonalDataState(
                username = savedStateHandle[StateHandleKeys.Username] ?: "",
                email = savedStateHandle[StateHandleKeys.Email] ?: ""
            ),
            trainingData = OnboardingTrainingDataState(
                trainingGoal = savedStateHandle[StateHandleKeys.TrainingGoal]
                    ?: TrainingGoal.Strength
            )
        )
    )
    val state: StateFlow<OnboardingState> = _state.asStateFlow()

    fun updateUsername(username: String) {
        savedStateHandle[StateHandleKeys.Username] = username
        _state.update { it.copy(personalData = it.personalData.copy(username = username)) }
    }

    fun updateEmail(email: String) {
        savedStateHandle[StateHandleKeys.Email] = email
        _state.update { it.copy(personalData = it.personalData.copy(email = email)) }
    }

    fun updateTrainingGoal(trainingGoal: TrainingGoal) {
        savedStateHandle[StateHandleKeys.TrainingGoal] = trainingGoal
        _state.update { it.copy(trainingData = it.trainingData.copy(trainingGoal = trainingGoal)) }
    }

    fun submit() {
        viewModelScope.launch {
            val user = User(
                username = _state.value.personalData.username,
                emailAddress = _state.value.personalData.email
            )

            userRepository.create(user)
        }
    }
}

private object StateHandleKeys {
    const val Username: String = "username"
    const val Email: String = "email"
    const val TrainingGoal: String = "training_goal"
}