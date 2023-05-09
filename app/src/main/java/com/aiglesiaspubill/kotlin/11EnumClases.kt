package com.aiglesiaspubill.kotlin

class `11EnumClases` {

    enum class Direction(val dir: Int) {
        NORTE(1), SUD(-1), ESTE(1), OESTE(-1);

        fun description() : String {
            return when(this) {
                NORTE -> "Estamos en el NORTE"
                SUD -> "Estamos en el SUD"
                ESTE -> "Estamos en el ESTE"
                OESTE -> "Estamos en el OESTE"
            }
        }
    }

    private fun enumClases() {

        var userDirection: Direction? = null
        println("Direccion: $userDirection")

        userDirection = Direction.ESTE
        println("Direccion: $userDirection")

        println("Propiedad name: ${userDirection.name}") //Nombre
        println("Propiedad ordinal: ${userDirection.ordinal}") //Posicion de ese enum en la creacion

        println(userDirection.description()) //Llamada a la funcion de enum

        println(userDirection.dir) //Puedo acceder a la variable creada en el enum
    }
}