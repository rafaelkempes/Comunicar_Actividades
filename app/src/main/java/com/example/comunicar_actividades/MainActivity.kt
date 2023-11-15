package com.example.comunicar_actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comunicar_actividades.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BAceder.setOnClickListener{
            var nombre  =  binding.Nombre.text.toString()
            //Creamos el intent
            var intent = Intent(this,Pantalla2::class.java)
            intent.putExtra("dato",nombre)

            //para abrir una la segunda pantalla
            startActivity(intent)
        }

        val extras = intent.extras
        //Alamazena la informacion
        val s =extras?.getString("frase")?:"error"

        binding.info.text = s
    }
}