package com.example.emlakotomasyon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.emlakotomasyon.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.auth.ktx.userProfileChangeRequest
import com.google.firebase.ktx.Firebase

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        auth = Firebase.auth

    }


    fun signUpButtonClicked(view: View) {
        val email = binding.emailText2.text.toString()
        val password = binding.passwordText2.text.toString()
        //val name = binding.nameAndSurnameText.text.toString()

        if (email.equals("") || password.equals("")) {
            Toast.makeText(this, "Enter email and password", Toast.LENGTH_LONG).show()
        } else {
            auth.createUserWithEmailAndPassword(email, password).addOnSuccessListener {
                val user = Firebase.auth.currentUser
             /*   val profileUpdates = userProfileChangeRequest {
                    displayName = name
                }
                user!!.updateProfile(profileUpdates)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                        }
                    }*/
                val intent = Intent(this, IlanActivity::class.java)
                startActivity(intent)
                finish()
            }.addOnFailureListener {
                Toast.makeText(this, it.localizedMessage, Toast.LENGTH_LONG).show()
            }
        }
    }
   fun goLoginButton(view: View){
       val intent = Intent(this,MainActivity::class.java)
       startActivity(intent)
       finish()

   }
}
