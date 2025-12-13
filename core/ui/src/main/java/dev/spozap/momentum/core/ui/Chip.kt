package dev.spozap.momentum.core.ui

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import dev.spozap.momentum.core.designsystem.theme.AppTheme

@Composable
fun Chip(
    modifier: Modifier = Modifier,
    label: String,
    selected: Boolean = false,
    colors: ChipColors = defaultChipColors(),
    onClick: () -> Unit = {}
) {

    val rotationDirection = remember(selected) {
        if (selected && kotlin.random.Random.nextBoolean()) -1f else 1f
    }

    val transition = updateTransition(
        targetState = selected,
        label = "ChipTransition"
    )

    val rotation by transition.animateFloat(
        transitionSpec = {
            if (targetState) {
                spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            } else {
                tween(durationMillis = 120)
            }
        },
        label = "rotation"
    ) {
        if (it) 8f * rotationDirection else 0f
    }

    val scale by transition.animateFloat(label = "scale") {
        if (it) 1.05f else 1f
    }

    val backgroundColor by transition.animateColor(label = "bg") {
        if (it) colors.selectedBackground else colors.background
    }

    val borderColor by transition.animateColor(label = "border") {
        if (it) colors.selectedBorder else colors.border
    }

    val textColor by transition.animateColor(label = "text") {
        if (it) colors.selectedText else colors.text
    }

    val borderWidth by transition.animateDp(label = "borderWidth") {
        if (it) 4.dp else 2.dp
    }

    Surface(
        modifier = modifier.graphicsLayer {
            rotationZ = rotation
            scaleX = scale
            scaleY = scale
        },
        shape = RoundedCornerShape(16.dp),
        color = backgroundColor,
        border = BorderStroke(borderWidth, borderColor),
        onClick = onClick
    ) {
        Box(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = label,
                style = AppTheme.typography.labelMedium,
                color = textColor
            )
        }
    }
}

data class ChipColors(
    val background: Color,
    val selectedBackground: Color,
    val border: Color,
    val selectedBorder: Color,
    val text: Color,
    val selectedText: Color
)

@Composable
fun defaultChipColors(): ChipColors {
    val colors = AppTheme.colorScheme
    return ChipColors(
        background = colors.surfaceVariant,
        selectedBackground = colors.primary,
        border = colors.outline,
        selectedBorder = colors.primary,
        text = colors.onSurface,
        selectedText = colors.onPrimary
    )
}