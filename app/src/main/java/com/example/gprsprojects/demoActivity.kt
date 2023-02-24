package com.example.gprsprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class demoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        supportActionBar?.hide()

        val buttonUpload = findViewById<Button>(R.id.btnUpload)
        val buttonDownload = findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener {

            Toast.makeText(applicationContext, "Uploading...", Toast.LENGTH_SHORT).show()

        }
        buttonDownload.setOnClickListener {
            Toast.makeText(applicationContext, "Downloading...", Toast.LENGTH_SHORT).show()
        }
    }
}