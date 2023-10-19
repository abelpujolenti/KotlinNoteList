package com.example.notelist

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.notelist.R

class MainActivity : ComponentActivity() {

    val table by lazy {findViewById<RecyclerView>(R.id.notes_table)}
    val notePreview by lazy {findViewById<Button>(R.id.note_list_cell)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)

        /*table.layoutManager = LinearLayoutManager(this);

        table.adapter = NoteAdapter(NoteRepository.GetAllNotes())*/

        /*notePreview.setOnClickListener{
            //onClick()
        }*/

    }

    /*fun onClick(view: View){
        val intent = Intent(this, SecondActivity::class.java).apply {
            //putExtra("title_note", )
            //putExtra("body_note", )
        };
        startActivity(intent)
    }*/
}