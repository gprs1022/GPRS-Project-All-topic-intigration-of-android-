package com.example.gprsprojects

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class intentActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        supportActionBar?.hide()

        val implicitbutton = findViewById<Button>(R.id.implicit)
        val explicitbutton = findViewById<Button>(R.id.explicit)

        implicitbutton.setOnClickListener {
            val intent = Intent(this,implicitActivity::class.java)
             startActivity(intent)

        }

        explicitbutton.setOnClickListener {
            val intent = Intent(this, explicitIntent::class.java)
            startActivity(intent)

        }
    }
}