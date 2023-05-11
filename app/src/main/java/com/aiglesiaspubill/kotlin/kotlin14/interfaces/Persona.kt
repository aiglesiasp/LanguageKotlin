package com.aiglesiaspubill.kotlin.kotlin14.interfaces

class Persona(name:String, age: Int) : Game {
    override val game: String
        get() = "Among Us"

    override fun play() {
        println("Esta persona esta jugando a $game")
    }
}