package com.android.vinod.notebook.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.vinod.notebook.database.Notes
import com.android.vinod.notebook.repository.NotesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(private val notesRepository: NotesRepository) :
    ViewModel() {

    init {
        fetchNotes()
    }

    private val notesLiveData = MutableLiveData<List<Notes>>()
    private fun fetchNotes() {
        viewModelScope.launch {
            try {
                val notes = notesRepository.getNotes()
                notesLiveData.postValue(notes)
            } catch (e: Exception) {

            }
        }
    }

    fun getNotesLiveData():LiveData<List<Notes>>{
        return notesLiveData;
    }
}