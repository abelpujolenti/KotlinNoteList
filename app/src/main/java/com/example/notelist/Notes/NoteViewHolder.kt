package com.example.notelist.Notes

import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.notelist.R

class NoteViewHolder(view: View) : ViewHolder(view) {

    val title by lazy {view.findViewById<TextView>(R.id.note_title)}
    val body by lazy {view.findViewById<TextView>(R.id.note_body)}

    fun SetupWithNote(note: NoteData){
        title.text = note.title;
        body.text = note.body;
    }

}