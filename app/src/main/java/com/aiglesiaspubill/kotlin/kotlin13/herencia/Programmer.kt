package com.aiglesiaspubill.kotlin.kotlin13.herencia

class Programmer(name: String, age: Int, var language: String): Person(name, age) {

    override fun work() {
        println("Esta persona esta programando")
    }

    fun sayLanguage() {
        println("Esta programando en $language")
    }
}