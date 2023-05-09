package com.aiglesiaspubill.kotlin

class `4SentenciaWhen` {

    private fun sentenciaWhen() {
        val country = "España"
        val age = 10
        when(country) {
            "España", "Mexico", "Peru" -> {
                println("El idioma es español")
            }
            "Estados Unidos", "Londres" -> {
                println("El idioma es ingles")
            }
            "Francia" -> {
                println("El idioma es frances")
            }
            else -> {
                println("No sabemos el idioma")
            }
        }

        when(age) {
            0, 1, 2 -> {
                println("Es un bebe")
            }
            in 3..10 -> {
                println("Eres un niño")
            }
            in 10..18 -> {
                println("Eres un adolescente")
            }
            in 18..60 -> {
                println("Eres un adulto")
            }
        }
    }
}