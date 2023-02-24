package com.example.gprsprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class quizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this, quiz2Activity::class.java)
            startActivity(intent)
        }, 3000)
    }
}