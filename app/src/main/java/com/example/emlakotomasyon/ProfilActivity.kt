package com.example.emlakotomasyon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.emlakotomasyon.databinding.ActivityProfilBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class ProfilActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityProfilBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        auth = Firebase.auth

        val user = Firebase.auth.currentUser

        user?.let {
            for (profile in it.providerData) {
                val name = profile.displayName
                binding.nameTextView.text = name.toString()

            }
        }
    }
        fun buttonLogOut(view: View) {
            auth.signOut()
            val intent = Intent(this@ProfilActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
            finishAffinity()

        }
        fun buttonDelete(view: View) {
            auth.currentUser?.delete()?.addOnCompleteListener {
                val intent = Intent(this@ProfilActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
                finishAffinity()

            }
        }
       /* fun changeName(view: View){
            val intent = Intent(this@ProfilActivity,ChangeNameActivity::class.java)
            startActivity(intent)
            finish()
        }
        fun changeEmail(view: View) {
            val intent = Intent(this@ProfilActivity, EmailActivity::class.java)
            startActivity(intent)
            finish()
        }
        fun changePassword(view: View){
            val intent=Intent(this@ProfilActivity,ChangePasswordActivity::class.java)
            startActivity(intent)
            finish()
        }*/

    }
