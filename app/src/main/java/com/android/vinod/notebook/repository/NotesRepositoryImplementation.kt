package com.android.vinod.notebook.repository

import com.android.vinod.notebook.database.Notes
import com.android.vinod.notebook.database.NotesDao
import javax.inject.Inject

class NotesRepositoryImplementation @Inject constructor(val notesDao: NotesDao) : NotesRepository {
    override fun getNotes(): List<Notes> {
        return notesDao.getAllNotes()
    }
}