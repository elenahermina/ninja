package com.elena.ninja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.elena.ninja.databinding.ActivityMainBinding
import com.elena.ninja.databinding.ItemLayoutBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val personaje1 = Personaje("Aragorn", "Humano", R.mipmap.ninja, true)
        val personaje2 = Personaje("Gandalf", "Mago", R.mipmap.magic, true)
        val personaje3 = Personaje("Boromir", "Humano", R.mipmap.knight, true)
        val personaje4 = Personaje("Legolas", "Elfo", R.mipmap.elf, true)
        val personaje5 = Personaje("Orco Feo", "Orco", R.mipmap.ogre, false)
        val personaje6 = Personaje("Smagu", "Dragon", R.mipmap.dragon, false)

        fillView(binding.layoutPersonaje1, personaje1)
        fillView(binding.layoutPersonaje2, personaje2)
        fillView(binding.layoutPersonaje3, personaje3)
        fillView(binding.layoutPersonaje4, personaje4)
        fillView(binding.layoutPersonaje5, personaje5)
        fillView(binding.layoutPersonaje6, personaje6)




    }


    private fun fillView(item: ItemLayoutBinding, personaje: Personaje) {
        item.iwFoto.setImageResource(personaje.image)


        item.iwFoto.setOnClickListener {
            val intent = Intent( this, PersonajeActivity::class.java)
            intent.putExtra ( "VALOR1", personaje.nombre)
            intent.putExtra("VALOR2", personaje.raza)
            intent.putExtra("VALOR3", personaje.image)
            startActivity(intent)
        }

    }




}