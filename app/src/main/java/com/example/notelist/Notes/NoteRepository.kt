package com.example.notelist.Notes

class NoteRepository {

    companion object{

        private var notesList = mutableListOf<NoteData>();
    }

    fun GetAllNotes(): List<NoteData> = notesList

    fun AddNote(note: NoteData){
        notesList.add(note)
    }
}