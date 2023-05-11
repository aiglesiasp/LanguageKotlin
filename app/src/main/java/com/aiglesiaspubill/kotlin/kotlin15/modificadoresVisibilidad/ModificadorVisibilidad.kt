package com.aiglesiaspubill.kotlin.kotlin15.modificadoresVisibilidad

class ModificadorVisibilidad {

    private fun visibilidadModificador() {

        //PUBLIC --> VISIBLE PARA TODOS desde TODOS LADOS
        val vPublic = VisibilityPublic()
        println(vPublic.name)

        //PRIVATE --> SOLO VISIBLE DESDE LA PROPIA CLASE o CON METODOS GETTERS/SETTERS
        val vPrivado = VisibilityPrivate()
        // println(vPrivado.name) --> error

        //PROTECTED --> VISIBLE DESDE LA PROPIA CLASE y DESDE LAS CLASES HIJAS

        //INTERNAL --> VISIBLES EN UN MODULO EN CONCRETO

    }

}