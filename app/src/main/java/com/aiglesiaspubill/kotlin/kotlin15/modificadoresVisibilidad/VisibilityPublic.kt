package com.aiglesiaspubill.kotlin.kotlin15.modificadoresVisibilidad

class VisibilityPublic {

    var name: String? = null

    fun sayMyName() {
        name?.let {
            println("My nombre es $it")
        } ?: run {
            println("No tengo nombre")
        }
    }
}

class VisibilityPrivate {

    private var name: String? = null

    private fun sayMyName() {
        name?.let {
            println("My nombre es $it")
        } ?: run {
            println("No tengo nombre")
        }
    }
}