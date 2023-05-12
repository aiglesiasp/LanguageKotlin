package com.aiglesiaspubill.kotlin.kotlin18.destructuring

import com.aiglesiaspubill.kotlin.kotlin16.dataclases.Worker

class DestructuringDeclarations {

    private fun destructuring() {
        val (name, age, work) = Worker("Aitor", 34, "Programador")
        println("$name $age $work")

        val aitor = Worker("Aitor", 34, "Programador")
        println(aitor.component1())

        val (pepitoName, pepitoAge, pepitoWork) = myWorker()
        println("$pepitoAge $pepitoName")

        //CON MAPAS
        val myMap = mapOf(1 to "Aitor", 2 to "Carmen", 3 to "Sara")
        //FORMA 1 - NORMAL
        for (element in myMap) {
            println("${element.key}, ${element.value}")
            println("${element.component1()}, ${element.component2()}")
        }
        //FORMA 2 - DESESTRUCTURANDO
        for ((key, value) in myMap) {
            println("$key $value")
        }

        //FORMA 3 - DESESTRUCTURANDO SIN USAR UNA VARIABLE
        for ((_, value) in myMap) {
            println("$value")
        }


    }

    private fun myWorker(): Worker {
        return Worker("Pepito", 18, "NINI")
    }

}