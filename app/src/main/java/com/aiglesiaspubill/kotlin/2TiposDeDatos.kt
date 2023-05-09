package com.aiglesiaspubill.kotlin

class `2TiposDeDatos` {

    private fun tiposDeDatos() {
        //STRING
        val myString: String = "Soy una cadena de texto"
        val myString2 = "Soy otra cadena"
        val myString3 = myString + " " + myString2
        println(myString3)

        //ENTEROS (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //DECIMALES (Float, Double)
        val myDouble: Double = 1.5
        val myDouble2 = 3.6
        val myDouble3 = myDouble + myDouble2
        println(myDouble3)

        //BOOLEAN (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        println(myBool == myBool2)
    }
}