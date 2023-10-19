package com.example.demokotlin.Heroes

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.demokotlin.Notes.NoteData
import com.example.notelist.R

class NoteViewHolder(view: View) : ViewHolder(view) {

    val cell by lazy { view.findViewById<TextView>(R.id.note_list_cell) }

    fun SetupWithNote(note: NoteData){
        cell.text = note.title
    }
}