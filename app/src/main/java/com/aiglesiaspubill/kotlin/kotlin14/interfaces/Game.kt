package com.aiglesiaspubill.kotlin.kotlin14.interfaces

interface Game {
    val game: String

    fun play()

    fun stream() {
        println("Estoy haciendo stream de $game")
    }
}