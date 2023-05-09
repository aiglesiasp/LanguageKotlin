package com.aiglesiaspubill.kotlin

class `1VariablesYConstantes` {

    fun variablesYConstantes() {
        //VARIABLES - Puedo modificar su valor
        var miPrimeraVariable = "String"
        println(miPrimeraVariable)

        //CONSTANTES - NO SE PUEDE modificar el valor
        val miPrimeraConstante = "Soy constante"
        println(miPrimeraConstante)
        val misecondConstant: String = miPrimeraConstante
        println(misecondConstant)
    }
}