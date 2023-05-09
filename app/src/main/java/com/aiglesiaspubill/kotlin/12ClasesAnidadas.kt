package com.aiglesiaspubill.kotlin

class `12ClasesAnidadas` {

    private val one = 1

    //CLASES ANIDAS
    class MyPrimeraClase {
        fun sum(first: Int, second: Int) : Int
        {
            return first + second //+ one
        }
    }

    // CLASES INTERNAS
    inner class MiClaseInterna {
        fun sumOne(number: Int) : Int
        {
            return number + one
        }
    }
}