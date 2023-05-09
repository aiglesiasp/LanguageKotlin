package com.aiglesiaspubill.kotlin

class BucleForWhile {

    val myArray: List<String> = listOf("Hola", "Adios" , "Hasta luego")
    val myMap: MutableMap<String, Int> = mutableMapOf("Aitor" to 1, "Pedro" to 2, "Anna" to 3)

    fun bucleFor() {
        for (valor in myArray) {
            println(valor)
        }

        for (myElement: MutableMap.MutableEntry<String, Int> in myMap) {
            println("Key ${myElement.key} con valor ${myElement.value}")
        }

        //De 0 a 10 ambos incluidos
        for(x in 0..10) {
            println(x)
        }

        //De 0 a 10 sin incluir el ultimo
        for (x in 0 until 10) {
            println(x)
        }
        //De 0 a 10 de dos en dos
        for (x in 0 until 10 step 2) {
            println(x)
        }

        //Decremental
        for(x in 10 downTo 0) {
            println(x)
        }
    }

    fun bucleWhile() {

        var x = 0
        while(x < 10) {
            println(x)
            x += 2
        }
    }
}