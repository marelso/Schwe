package com.marelso.designsystem.components.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.marelso.designsystem.components.button.data.ButtonAction

@Composable
fun ActionButtonComponent(
    modifier: Modifier = Modifier,
    action: ButtonAction,
) {
    if (action.isOutlined) {
        OutlinedButtonComponent(modifier = modifier, action = action)
    } else {
        SimpleButtonComponent(modifier = modifier, text = action.label) {
            action.onClick.invoke()
        }
    }
}