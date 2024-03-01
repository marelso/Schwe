package com.marelso.designsystem.components.button

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.marelso.designsystem.ui.theme.dimen2

@Composable
fun SimpleButtonComponent(
    modifier: Modifier = Modifier,
    text: String,
    background: Color = MaterialTheme.colorScheme.primary,
    color: Color = MaterialTheme.colorScheme.surface,
    radius: Dp = dimen2,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick.invoke() },
        colors = ButtonDefaults.buttonColors(
            containerColor = background,
            contentColor = color
        ),
        shape = RoundedCornerShape(radius),

        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = text,
            maxLines = 1,
            color = color
        )
    }
}