package com.aiglesiaspubill.kotlin.kotlin13.herencia

open class Person(name: String, age: Int) : Work() {

    open fun work() {
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        println("De camino al trabajo")
    }
}