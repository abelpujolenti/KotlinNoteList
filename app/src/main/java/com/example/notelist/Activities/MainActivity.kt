package com.example.notelist.Activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demokotlin.Notes.NoteAdapter
import com.example.demokotlin.Notes.NoteRepository
import com.example.notelist.R

class MainActivity : ComponentActivity() {

    val button by lazy {findViewById<Button>(R.id.add_new_note)}
    val table by lazy {findViewById<RecyclerView>(R.id.myHeroesTable)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)

        val shared = this.getSharedPreferences("MySharedPreferencesStorage", Context.MODE_PRIVATE);
        val timesOpenApp = shared.getInt("AppOpenTimes", 0)

        table.layoutManager = LinearLayoutManager(this);

        table.adapter = NoteAdapter(NoteRepository.GetAllNotes())

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            //intent.putExtra("title", )
            this.startActivity(intent)
            overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left)
        }



    }
}