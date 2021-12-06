package com.android.vinod.notebook.view.composeviews

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun showFloatingActionButton(listener: OnFloatingButtonClickListener) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    listener.onFloatingButtonClick()
                },
                shape = CircleShape,
                backgroundColor = Color.Blue
            ) {
                Icon(Icons.Filled.Add, "")
            }
        },
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.End
    ) {

    }

}

interface OnFloatingButtonClickListener {
    fun onFloatingButtonClick()
}