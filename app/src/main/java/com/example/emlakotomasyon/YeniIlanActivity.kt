package com.example.emlakotomasyon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.emlakotomasyon.databinding.ActivityMainBinding
import com.example.emlakotomasyon.databinding.ActivityYeniIlanBinding

class YeniIlanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityYeniIlanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYeniIlanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val EmlakTipi = resources.getStringArray(R.array.EmlakTipi)
        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        if (spinner1 != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,EmlakTipi)
            spinner1.adapter=adapter

            spinner1.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long){
                    //buraya işlemi yazacaksın

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
       val OdaSayisi = resources.getStringArray(R.array.OdaSayisi)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        if (spinner2 != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,OdaSayisi)
            spinner2.adapter=adapter

            spinner2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long){
                    //buraya işlemi yazacaksın

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
        val BinaYasi = resources.getStringArray(R.array.BinaYasi)
        val spinner3 = findViewById<Spinner>(R.id.spinner3)
        if (spinner3 != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,BinaYasi)
            spinner3.adapter=adapter

            spinner3.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long){
                    //buraya işlemi yazacaksın

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
        val BulunduguKat = resources.getStringArray(R.array.BulunduguKat)
        val spinner4 = findViewById<Spinner>(R.id.spinner4)
        if (spinner4 != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,BulunduguKat)
            spinner4.adapter=adapter

            spinner4.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long){
                    //buraya işlemi yazacaksın

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
        val Isitma = resources.getStringArray(R.array.Isitma)
        val spinner5 = findViewById<Spinner>(R.id.spinner5)
        if (spinner5 != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,Isitma)
            spinner5.adapter=adapter

            spinner5.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long){
                    //buraya işlemi yazacaksın

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
        val Balkon = resources.getStringArray(R.array.Balkon)
        val spinner6 = findViewById<Spinner>(R.id.spinner6)
        if (spinner6 != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,Balkon)
            spinner6.adapter=adapter

            spinner6.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long){
                    //buraya işlemi yazacaksın

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
        val Esyali = resources.getStringArray(R.array.Esyali)
        val spinner7 = findViewById<Spinner>(R.id.spinner7)
        if (spinner7 != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,Esyali)
            spinner7.adapter=adapter

            spinner7.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long){
                    //buraya işlemi yazacaksın

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
        val BanyoSayisi = resources.getStringArray(R.array.BanyoSayisi)
        val spinner8 = findViewById<Spinner>(R.id.spinner8)
        if (spinner8 != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,BanyoSayisi)
            spinner8.adapter=adapter

            spinner8.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long){
                    //buraya işlemi yazacaksın

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
    }

}