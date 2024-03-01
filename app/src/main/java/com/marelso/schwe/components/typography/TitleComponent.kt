package com.marelso.designsystem.components.typography

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun TitleComponent(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onSurface,
    fontWeight: Int = 500,
    maxLines: Int = 2
) = Text(
    text = text,
    maxLines = maxLines,
    overflow = textOverflow,
    textAlign = textAlign,
    style = MaterialTheme.typography.titleMedium.copy(
        color = color,
        fontWeight = FontWeight(fontWeight)
    ),
    modifier = modifier
)