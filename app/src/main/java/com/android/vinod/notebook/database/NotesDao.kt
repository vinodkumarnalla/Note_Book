package com.android.vinod.notebook.database

import androidx.room.*

@Dao
interface NotesDao {

    @Insert
    fun addNotes(notes: Notes)

    @Delete
    fun deleteNotes(notes: Notes)

    @Update
    fun updateNotes(notes: Notes)

    @Query("SELECT*FROM " + NotesDataBase.TABLE_NAME)
    fun getAllNotes(): List<Notes>
}