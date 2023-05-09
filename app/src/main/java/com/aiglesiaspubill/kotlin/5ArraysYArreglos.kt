package com.aiglesiaspubill.kotlin

class `5ArraysYArreglos` {

    private fun arraysYArreglos() {
        val name = "Aitor"
        val surname = "Iglesias"
        val company = "No se sabe"
        val age = "32"

        //Creacion de Array
        val myArray = arrayListOf<String>()

        //Añadir datos
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        //Añadir conjunto
        myArray.addAll(listOf("Hola", "Otro dato"))

        //Acceso a datos
        val company2 = myArray[1]

        //Modificacio de datos
        myArray[4] = "Modificacion"

        //Eliminar datos
        myArray.removeAt(1)

        //Recorrer arrays
        myArray.forEach {
            println(it)
        }

        //Otras operaciones
        myArray.count()
        myArray.clear()
        myArray.first()
        myArray.last()
        myArray.sort()
    }
}