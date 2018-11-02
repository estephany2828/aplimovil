package com.example.invitado.miprimeraapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio.*
import kotlinx.android.synthetic.main.activity_menu_opciones.*

class MenuOpciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_opciones)
//almacenando las extras del intento en variables bandle


        val bundle = intent.extras
        val nombre = bundle.get("nombre")
        val edad = bundle.get("edad")
        textNombreOpcion.setText("Bienvenid@ $nombre")


        btnFrutas.setOnClickListener{
            //var almacena donde esta y para donde se ca codigo para pasar de una actividad a otra
            val intent = Intent(this,Frutas::class.java)
            startActivity(intent)
        }
        btnColorcitos.setOnClickListener{
            //var almacena donde esta y para donde se ca codigo para pasar de una actividad a otra
            val intent = Intent(this,Colorcitos::class.java)
            startActivity(intent)
        }
        btnAnimalitos.setOnClickListener{
            //var almacena donde esta y para donde se ca codigo para pasar de una actividad a otra
            val intent = Intent(this,Animales::class.java)
            startActivity(intent)
        }



    }
}
