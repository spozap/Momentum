package dev.spozap.momentum.core.ui.mappers

import dev.spozap.momentum.core.model.training.TrainingGoal

// TODO: Move this to res
fun TrainingGoal.localizedLabel(): String = when (this) {
    TrainingGoal.Strength -> "Fuerza"
    TrainingGoal.Endurance -> "Endurecimiento"
    TrainingGoal.Flexibility -> "Flexibilidad"
    TrainingGoal.WeightLoss -> "Pérdida de peso"
}