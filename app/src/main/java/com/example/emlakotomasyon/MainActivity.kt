package com.example.emlakotomasyon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.emlakotomasyon.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        auth = FirebaseAuth.getInstance()
        val currentUser = auth.currentUser

        if (currentUser != null) {
            val intent = Intent(this, IlanActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
    fun loginButtonClicked(view:View){
        val email = binding.emailText2.text.toString()
        val password = binding.passwordText2.text.toString()
        if (email.equals("") || password.equals("")) {
            Toast.makeText(this, "Enter email and password", Toast.LENGTH_LONG).show()

        } else {
            auth.signInWithEmailAndPassword(email, password).addOnSuccessListener {
                val intent = Intent(this@MainActivity, IlanActivity::class.java)
                startActivity(intent)
                finish()
            }.addOnFailureListener {
                Toast.makeText(this@MainActivity, it.localizedMessage, Toast.LENGTH_LONG).show()
            }
        }

    }
    fun signupButtonClicked(view: View){
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun forgotPasswordClicked(view: View){
        val intent= Intent(this, ResetPasswordActivity::class.java)
        startActivity(intent)
        finish()
    }





}