package com.aiglesiaspubill.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CLASES
        val clase = `10Clases`(
            "Aitor",
            33, arrayOf(com.aiglesiaspubill.kotlin.`10Clases`.Language.CATALAN, com.aiglesiaspubill.kotlin.`10Clases`.Language.CASTELLANO))
        println(clase.name)
        //Llamar a una funcion
        clase.getLanguages()

        val clase2 = `10Clases`(
            "Aitor",
            33,
            arrayOf(com.aiglesiaspubill.kotlin.`10Clases`.Language.CATALAN, com.aiglesiaspubill.kotlin.`10Clases`.Language.CASTELLANO),
            arrayOf(clase))

        println("${clase2.friends?.first()?.name}")


        //CLASES ANIDADAS
        val prueba = `12ClasesAnidadas`.MyPrimeraClase()
        val sum = prueba.sum(10, 5)
        println("El valor de la suma es $sum")
    }
}