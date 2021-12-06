package com.android.vinod.notebook.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import com.android.vinod.notebook.R
import com.android.vinod.notebook.view.composeviews.addNotesTextField
import com.android.vinod.notebook.view.composeviews.addTitleTextField

class CreateNotesActivity : AppCompatActivity() {
    private val titleText = mutableStateOf(TextFieldValue())
    private val notesText = mutableStateOf(TextFieldValue())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
                addTitleTextField(titleText,getString(R.string.title))
                addNotesTextField(notesText,getString(R.string.notes))
            }

        }
    }
}



