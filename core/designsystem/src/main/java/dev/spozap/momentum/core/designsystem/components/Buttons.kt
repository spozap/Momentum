package dev.spozap.momentum.core.designsystem.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.spozap.momentum.core.designsystem.theme.AppTheme

@Composable
fun MomentumButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = AppTheme.colorScheme.primary,
        contentColor = AppTheme.colorScheme.onPrimary
    ),
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = colors,
        contentPadding = PaddingValues(vertical = 16.dp),
        shape = AppTheme.shapes.buttonSmall,
        content = content
    )
}