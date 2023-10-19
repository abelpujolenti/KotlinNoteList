package com.example.demokotlin.Notes

class NoteRepository {

    companion object{

        private val notesList = listOf(
            NoteData("Aquaman", "Es un pez"),
            NoteData("Superman", "Debil ante una gema verde"),
            NoteData("Batman", "Es huerfano"),
            NoteData("SpiderCerdo", "Es un pez"),
            NoteData("SpiderCerdo", "Es un pez"),
            NoteData("SpiderCerdo", "Es un pez"),
            NoteData("SpiderCerdo", "Es un pez"),
            NoteData("SpiderCerdo", "Es un pez"),
            NoteData("SpiderCerdo", "Es un pez"),
            NoteData("SpiderCerdo", "Es un pez")
        )

        fun GetAllNotes(): List<NoteData> = notesList
    }
}