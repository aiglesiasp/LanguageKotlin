package com.aiglesiaspubill.kotlin

class Funciones {

    private fun funciones() {
        sayHello()
        sayMyName("Aitor")
        sayMyNameAndAge("Aitor", 33)
        val suma = sumar(3, 4)
        println(suma)
    }

    //Funcion simple
    fun sayHello() {
        println("Hola")
    }

    //Funcion con 1 parametro
    fun sayMyName(nombre: String) {
        println("Hola mi nombre es ${nombre}")
    }

    //Funcion con +1 parametro
    fun sayMyNameAndAge(nombre: String, edad: Int) {
        println("Hola mi nombre es ${nombre} y tengo ${edad} años")
    }

    //Funciones con retorno
    fun sumar(num1: Int, num2: Int) : Int {
        val sum: Int = num1 + num2
        return sum
    }
}