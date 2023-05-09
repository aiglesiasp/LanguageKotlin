package com.aiglesiaspubill.kotlin

class NullSafety {

    fun nullSafety() {
        var myString = "AitorIGelsias"
        //myString = null
        println(myString)

        //Variable opcional
        var mySafetyString: String? = "Cadena segura"
        mySafetyString = null
        mySafetyString = "null"

        //1a manera de comprobar si es nulo
        if (mySafetyString != null) {
            println(mySafetyString.length)
        }

        //2a manera de comprobar si es nulo
        println(mySafetyString?.length)

        //3a manera con LET
        mySafetyString?.let {
            println(it)
        }

        //4a manera con LET + RUN si es NULL
        mySafetyString?.let {
            println(it)
        } ?: kotlin.run {
            println(mySafetyString)
        }


    }
}