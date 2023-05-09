package com.aiglesiaspubill.kotlin

class `3SentenciasIF` {
    private fun sentenciasIF() {
        val myNumber = 10
        //Operadores condicionales
        // > mayor que
        // < menor que
        // <= mayor o igual que
        // >= menor o igual que
        // == igualada
        // != desigualda

        //OPERADORES LOGICOS
        // && operador "y"
        // || operador "o"
        // ! operador "no"

        if(myNumber <= 10 && myNumber > 7) {
            println("$myNumber es menor que 10")
        } else if(myNumber == 60) {
            println("$myNumber es 60")
        } else {
            println("$myNumber es mayor o igual que 10")
        }
    }
}