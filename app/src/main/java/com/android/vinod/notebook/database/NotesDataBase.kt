package com.android.vinod.notebook.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities = [Notes::class])
abstract class NotesDataBase: RoomDatabase() {

    companion object{
        public const val TABLE_NAME ="notes"
    }

    abstract fun getNotesDao(): NotesDao
}