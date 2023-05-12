package com.aiglesiaspubill.kotlin.kotlin16.dataclases

data class Worker(
    val name: String = "",
    val age: Int = 0,
    val work: String = ""
) {
    var lastWork: String = ""
}

private fun llamarDataClases(){
    val trabajador = Worker("Aitor", 34, "Programador")
    trabajador.lastWork = "Musico"
    val trabajador2 = Worker("Aitor", 34, "Programador")
    val trabajador3 = Worker("Paco", 18, "Tecnico")

    // equals & hasCode
    if(trabajador.equals(trabajador2)) {
        println("Son iguales")
    } else {
        println("Son diferentes")
    }

    //to string
    println(trabajador3.toString())

    //copy
    val copia = trabajador.copy(age = 26) //copia los campos y modifica el valor de age

    // tupla
    val (name, age) = trabajador
    println(name)
    println(age)
}
