package com.example.gprsprojects

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExploreActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        supportActionBar?.hide()

        val demobutton = findViewById<Button>(R.id.demo)
        val webButton = findViewById<Button>(R.id.webView)
        val bindingbutton = findViewById<Button>(R.id.viewbinding)
        val intentbutton = findViewById<Button>(R.id.intents)
        val scrollbutton = findViewById<Button>(R.id.scroll)
        val theambutton = findViewById<Button>(R.id.dark)
        val quizbutton = findViewById<Button>(R.id.quiz)
        val loginbutton = findViewById<Button>(R.id.login)


        demobutton.setOnClickListener {
         val intent = Intent(this, demoActivity::class.java)
            startActivity(intent)

        }

        webButton.setOnClickListener {
            val intent = Intent(this, webActivity::class.java)
            startActivity(intent)

        }

        bindingbutton.setOnClickListener {
            val intent = Intent(this, bindingActivity::class.java)
            startActivity(intent)

        }
        intentbutton.setOnClickListener {
            val intent = Intent(this, intentActivity::class.java)
            startActivity(intent)

        }

        scrollbutton.setOnClickListener {
            val intent = Intent(this, scrollActivity::class.java)
            startActivity(intent)

        }
        theambutton.setOnClickListener {
            val intent = Intent(this, theamActivity::class.java)
            startActivity(intent)

        }
        quizbutton.setOnClickListener {
            val intent = Intent(this, quizActivity::class.java)
            startActivity(intent)

        }
        loginbutton.setOnClickListener {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)

        }




    }
}