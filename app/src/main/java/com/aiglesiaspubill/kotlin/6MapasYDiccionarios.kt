package com.aiglesiaspubill.kotlin

class `6MapasYDiccionarios` {
    private fun maps() {
        //Definicion
        var myMap: Map<String, Int> = mapOf()
        //Añadir valores
        myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Aitor" to 5)
        myMap["Aitor"] = 6
        myMap.put("Maria", 4)

        //Acceder a valores
        val valor = myMap["Aitor"]

        //Eliminacion de datos
        myMap.remove("Aitor")

    }
}