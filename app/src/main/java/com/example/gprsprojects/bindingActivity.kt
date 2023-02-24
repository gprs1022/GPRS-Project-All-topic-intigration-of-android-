package com.example.gprsprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class bindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binding)

        supportActionBar?.hide()
    }
}