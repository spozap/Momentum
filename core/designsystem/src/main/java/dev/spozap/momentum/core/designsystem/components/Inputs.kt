package dev.spozap.momentum.core.designsystem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.spozap.momentum.core.designsystem.theme.AppTheme

@Composable
fun MomentumTextInput(
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    value: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    onValueChange: (String) -> Unit
) {
    Column {
        Text(
            label,
            style = AppTheme.typography.labelMedium,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        TextField(
            modifier = modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
            ),
            textStyle = AppTheme.typography.labelMedium,
            value = value,
            enabled = enabled,
            onValueChange = onValueChange,
            keyboardOptions = keyboardOptions,
            shape = RoundedCornerShape(8.dp),
        )
    }
}