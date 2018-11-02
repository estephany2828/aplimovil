package com.example.invitado.miprimeraapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio.*

class Inicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        //Declaracion variables
        //Variables inmutables no pueden cambiar de valor VAL
        //Variables mutables son las que cambian tiempo ejecucio  VAR
        //val numero:Int=0
        //var nombre : String="Hola"

        //permite declarar variables nulas
        //var nombreNulo: String =null

        btnSiguiente.setOnClickListener{
            //var almacena donde esta y para donde se ca codigo para pasar de una actividad a otra
            val intent = Intent(this,MenuOpciones::class.java)
            intent.putExtra("nombre", inputNombre.text.toString())
            intent.putExtra("edad",inputEdad.text.toString())

            startActivity(intent)
            //escriba en la caja de texto tipo cadena
        }



    }
}

//extens se reemplaza por los dos puntos inicio es la clase principal
//todo lo q este en el override