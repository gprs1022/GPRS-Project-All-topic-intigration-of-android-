package com.example.gprsprojects

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity()   {

    private lateinit var auth : FirebaseAuth
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()
        val name = intent.getStringExtra(signInActivity.KEY2)

        val mail = intent.getStringExtra(signInActivity.KEY1)

        val userId = intent.getStringExtra(signInActivity.KEY3)

        val welcomeText = findViewById<TextView>(R.id.tVWelcome)
        val mailText = findViewById<TextView>(R.id.tVMail)
        val idText = findViewById<TextView>(R.id.tVUniqueId)
        welcomeText.text = "Welcome: $name"

        mailText.text ="Mail: $mail"
        idText.text = "UserId :$userId"


        auth = FirebaseAuth.getInstance()

        val email = intent.getStringExtra("email")
        val displayName = intent.getStringExtra("name")




       val explorebutton = findViewById<Button>(R.id.explore)


        explorebutton.setOnClickListener {
            val intent = Intent(this, ExploreActivity::class.java)
            startActivity(intent)

        }
    }
}