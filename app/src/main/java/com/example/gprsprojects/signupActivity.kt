package com.example.gprsprojects

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider

class signupActivity : AppCompatActivity()  {


    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        supportActionBar?.hide()


        val signUpButton = findViewById<Button>(R.id.SignUpbtn)
        val userName    = findViewById<TextInputEditText>(R.id.etName)
        val userMail   = findViewById<TextInputEditText>(R.id.etEmail)
        val userId       = findViewById<TextInputEditText>(R.id.etUserName)
        val userPassword = findViewById<TextInputEditText>(R.id.etPassword)



        signUpButton.setOnClickListener {

            val name = userName.text.toString()
            val mail = userMail.text.toString()
            val uniqueId = userId.text.toString()
            val usrpassword = userPassword.text.toString()

            val user = User(name, mail, usrpassword, uniqueId)

            database = FirebaseDatabase.getInstance().getReference("User")

            database.child(uniqueId).setValue(user).addOnSuccessListener {


                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            }



        }

        val signIntext = findViewById<TextView>(R.id.tVsignIn)

        signIntext.setOnClickListener {

            val openSignInActivity = Intent(this, signInActivity::class.java)
            startActivity(openSignInActivity)
        }

    }
}