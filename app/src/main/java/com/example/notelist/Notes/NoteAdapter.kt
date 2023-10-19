package com.example.demokotlin.Notes

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.demokotlin.Heroes.NoteViewHolder
import com.example.notelist.R

class NoteAdapter(private val noteList: List<NoteData>) : Adapter<NoteViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NoteViewHolder(layoutInflater.inflate(R.layout.note_list_cell, parent, false))
    }

    override fun getItemCount(): Int  = noteList.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.SetupWithNote(noteList[position])
    }
}