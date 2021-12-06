package com.android.vinod.notebook.view.composeviews

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun addTitleTextField(text: MutableState<TextFieldValue>, label: String){
    OutlinedTextField(
        value = text.value,
        onValueChange = {
            text.value = it
        },
        label = { Text(text = label, style = TextStyle(Color.Black)) },
        maxLines = 1,
        textStyle = TextStyle(color = Color.Black),
        modifier = Modifier
            .padding(20.dp, 20.dp, 20.dp, 0.dp)
            .fillMaxWidth()
    )
}

@Composable
fun addNotesTextField(text: MutableState<TextFieldValue>, label: String){
    OutlinedTextField(
        value = text.value,
        onValueChange = {
            text.value = it
        },
        label = { Text(text = label, style = TextStyle(Color.Black)) },
        textStyle = TextStyle(color = Color.Black),
        modifier = Modifier
            .padding(20.dp, 20.dp, 20.dp, 20.dp)
            .fillMaxWidth().fillMaxHeight()
    )
}