package com.example.gprsprojects

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class theamActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theam)

        supportActionBar?.hide()

        val buttonDark=findViewById<Button>(R.id.btnDark)
        val buttonRead= findViewById<Button>(R.id.btnRead)

        val layout = findViewById<LinearLayout>(R.id.LinearLayout)
        buttonRead.setOnClickListener {
            // change to light mode
            layout.setBackgroundResource(R.color.yellow)

        }
        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }

    }
}