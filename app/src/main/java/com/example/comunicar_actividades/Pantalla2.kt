package com.example.comunicar_actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comunicar_actividades.databinding.ActivityMainBinding
import com.example.comunicar_actividades.databinding.ActivityPantalla2Binding

class Pantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =ActivityPantalla2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //Recoger inforaccion
        val extras = intent.extras
        //Alamazena la informacion
        val s =extras?.getString("dato")?:"sin nombre"
        //mostrar el mensaje
        binding.Bienbenido.text = "Bienvenido " +s +" ¿Acepta los terminos?"

        //si damos al boton de aceptar
        binding.BAceptar.setOnClickListener{
            val intent = Intent(this, MainActivity :: class.java)
            intent.putExtra("mensaje","Has acceptado los terminos")
            startActivity(intent)
        }

        binding.BRechazar.setOnClickListener{
            val intent = Intent(this, MainActivity :: class.java)
            intent.putExtra("mensaje","Has Rechazado los terminos")
            startActivity(intent)
        }
    }
}