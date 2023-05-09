package com.example.emlakotomasyon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.emlakotomasyon.databinding.ActivityResetPasswordBinding
import com.google.firebase.auth.FirebaseAuth

class ResetPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResetPasswordBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        auth = FirebaseAuth.getInstance()



        binding.button4.setOnClickListener {
            val email = binding.emailText3.text.toString()
            if (email.equals("")) {
                Toast.makeText(this, "Please enter email", Toast.LENGTH_LONG).show()

            } else {
                auth.sendPasswordResetEmail(email).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Please check your email", Toast.LENGTH_LONG).show()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
        binding.backToLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
