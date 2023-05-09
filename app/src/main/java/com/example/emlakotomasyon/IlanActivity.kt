package com.example.emlakotomasyon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class IlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilan)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.ilan_ekle) {
            val intent = Intent(this@IlanActivity, YeniIlanActivity::class.java)
            startActivity(intent)
        }
        if(item.itemId==R.id.Profil){
            val intent = Intent(this@IlanActivity,ProfilActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}