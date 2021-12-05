package com.android.vinod.notebook.di

import com.android.vinod.notebook.repository.NotesRepository
import com.android.vinod.notebook.repository.NotesRepositoryImplementation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface NotesRepoModule {

    @Binds
    fun getNotesRepository(notesRepo: NotesRepositoryImplementation): NotesRepository
}