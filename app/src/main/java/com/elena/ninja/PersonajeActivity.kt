package com.elena.ninja

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.elena.ninja.databinding.ActivityPersonajeBinding

class PersonajeActivity : AppCompatActivity() {

    lateinit var binding : ActivityPersonajeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("VALOR1")
        val  raza = intent.getStringExtra("VALOR2")
        val idImage = intent.getIntExtra("VALOR3", R.mipmap.ic_launcher)
        // estamops llamando lo que quieremos presentar en pantalla
        binding.imageView2.setImageResource(idImage)
        binding.textView.text= name
        binding.textView2.text= raza

    }
}