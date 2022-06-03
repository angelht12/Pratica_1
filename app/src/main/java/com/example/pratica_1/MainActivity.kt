package com.example.pratica_1

import android.app.Activity
// traer los paquetes de las vistas
import android.os.Bundle
// enlazar elementos de la vista con el codigo
import com.example.pratica_1.databinding.ActivityMainBinding
//el activity es una vista
// declarando una clase
class MainActivity : Activity() {
    // Una variable tipo privada
    // lateinit: sirve para declara una propiedad cuando se contruye un objeto
    private lateinit var binding: ActivityMainBinding
    //overrible: sobre escribir
    //Super: esta llamado a onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //asignado valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //modificar el valor de textview
        //binding.text.text="angel"

    }
}