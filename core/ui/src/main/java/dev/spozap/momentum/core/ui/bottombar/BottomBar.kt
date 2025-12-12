package dev.spozap.momentum.core.ui.bottombar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.spozap.momentum.core.designsystem.theme.AppTheme

@Composable
fun BoxScope.BottomBar(
    selectedItem: Int,
    onItemSelected: (Int) -> Unit
) {
    val items = listOf("Home", "Settings", "Profile")

    Row(
        modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 32.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(AppTheme.colorScheme.primary)
            .padding(horizontal = 24.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        items.forEachIndexed { index, item ->
            BottomBarItem(
                name = item,
                isSelected = index == selectedItem,
                onClick = { onItemSelected(index) }
            )
        }
    }
}

@Composable
private fun BottomBarItem(
    name: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(if (isSelected) AppTheme.colorScheme.secondary else Color.Transparent)
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Text(
            text = name,
            style = AppTheme.typography.bodyLarge,
            color = if (isSelected) Color.White else AppTheme.colorScheme.onPrimary
        )
    }
}


@Composable
private fun BottomBarItem(name: String) {
    Column {
        Text(name, style = AppTheme.typography.bodyLarge)
    }
}