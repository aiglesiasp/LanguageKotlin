package com.aiglesiaspubill.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aiglesiaspubill.kotlin.kotlin10.clases.Clases
import com.aiglesiaspubill.kotlin.kotlin13.herencia.Designer
import com.aiglesiaspubill.kotlin.kotlin13.herencia.Programmer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CLASES
        val clase = Clases(
            "Aitor",
            33, arrayOf(com.aiglesiaspubill.kotlin.kotlin10.clases.Clases.Language.CATALAN, com.aiglesiaspubill.kotlin.kotlin10.clases.Clases.Language.CASTELLANO))
        println(clase.name)
        //Llamar a una funcion
        clase.getLanguages()

        val clase2 = Clases(
            "Aitor",
            33,
            arrayOf(com.aiglesiaspubill.kotlin.kotlin10.clases.Clases.Language.CATALAN, com.aiglesiaspubill.kotlin.kotlin10.clases.Clases.Language.CASTELLANO),
            arrayOf(clase))

        println("${clase2.friends?.first()?.name}")


        //CLASES ANIDADAS
        val prueba = com.aiglesiaspubill.kotlin.kotlin12.clasesAnidadas.ClasesAnidadas.MyPrimeraClase()
        val sum = prueba.sum(10, 5)
        println("El valor de la suma es $sum")

        //HERENCIA DE CLASES
        val programmer = Programmer("Aitor", 34, "Kotlin")
        programmer.work()
        programmer.sayLanguage()
        val designer = Designer("Camila", 23)
        designer.work()
    }
}