package com.aiglesiaspubill.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CLASES
        val clase = Clases(
            "Aitor",
            33, arrayOf(com.aiglesiaspubill.kotlin.Clases.Language.CATALAN, com.aiglesiaspubill.kotlin.Clases.Language.CASTELLANO))
        println(clase.name)
        //Llamar a una funcion
        clase.getLanguages()

        val clase2 = Clases(
            "Aitor",
            33,
            arrayOf(com.aiglesiaspubill.kotlin.Clases.Language.CATALAN, com.aiglesiaspubill.kotlin.Clases.Language.CASTELLANO),
            arrayOf(clase))

        println("${clase2.friends?.first()?.name}")


        //CLASES ANIDADAS
        val prueba = ClasesAnidadas.MyPrimeraClase()
        val sum = prueba.sum(10, 5)
        println("El valor de la suma es $sum")
    }
}