package com.android.vinod.notebook.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.android.vinod.notebook.database.NotesDao
import com.android.vinod.notebook.database.NotesDataBase
import com.android.vinod.notebook.repository.NotesRepository
import com.android.vinod.notebook.repository.NotesRepositoryImplementation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NotesDataBaseModule {

    @Provides
    fun getNotesDao(notesDataBase: NotesDataBase): NotesDao {
        return notesDataBase.getNotesDao()
    }

    @Provides
    @Singleton
    fun getNotesDataBase(@ApplicationContext context: Context): NotesDataBase {
        return Room.databaseBuilder(context, NotesDataBase::class.java, "notes").build()
    }

}