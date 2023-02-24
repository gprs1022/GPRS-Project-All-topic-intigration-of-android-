package com.example.gprsprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class scrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)

        supportActionBar?.hide()
    }
}