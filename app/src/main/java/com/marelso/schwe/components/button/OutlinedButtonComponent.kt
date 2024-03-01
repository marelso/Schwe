package com.marelso.designsystem.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.marelso.designsystem.components.button.data.ButtonAction
import com.marelso.designsystem.ui.theme.dimen2
import com.marelso.designsystem.ui.theme.dimen6

@Composable
fun OutlinedButtonComponent(
    modifier: Modifier = Modifier,
    action: ButtonAction,
    color: Color = MaterialTheme.colorScheme.primary,
    background: Color = MaterialTheme.colorScheme.onPrimary,
    radius: Dp = dimen2
) {
    OutlinedButton(
        onClick = { action.onClick.invoke() },
        shape = RoundedCornerShape(radius),
        colors = ButtonDefaults.buttonColors(
            containerColor = background,
            contentColor = color
        ),
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            action.leadingIcon?.let {
                Icon(
                    painter = painterResource(it),
                    modifier = Modifier
                        .height(dimen6)
                        .width(dimen6),
                    tint = color,
                    contentDescription = "Action for ${action.label}"
                )
            }

            Text(
                text = action.label,
                maxLines = 1,
                color = color
            )

            action.trailingIcon?.let {
                Icon(
                    painter = painterResource(it),
                    modifier = Modifier
                        .height(dimen6)
                        .width(dimen6),
                    tint = color,
                    contentDescription = "Action for ${action.label}"
                )
            }
        }
    }
}