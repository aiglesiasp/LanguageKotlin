package com.aiglesiaspubill.kotlin.kotlin13.herencia

class Designer(name: String, age: Int): Person(name, age) {

    override fun work() {
        println("Esta persona esta diseñando")
    }
}