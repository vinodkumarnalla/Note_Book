package com.android.vinod.notebook.repository

import com.android.vinod.notebook.database.Notes

interface NotesRepository {

    fun getNotes():List<Notes>
}