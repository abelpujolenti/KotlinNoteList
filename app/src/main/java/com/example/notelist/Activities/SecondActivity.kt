package com.example.notelist.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.notelist.R

class SecondActivity : AppCompatActivity() {

    val backButton by lazy {findViewById<ImageButton>(R.id.back_button)}
    val deleteButton by lazy {findViewById<ImageButton>(R.id.delete_note_button)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_screen)

        backButton.setOnClickListener {
            finish()
        }
    }
}