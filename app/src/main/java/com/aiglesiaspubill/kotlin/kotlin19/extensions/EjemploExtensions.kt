package com.aiglesiaspubill.kotlin.kotlin19.extensions

import java.util.Date

class EjemploExtensions {

    private fun probarExtension() {
        val myDate = Date()
        println(myDate.customFormat())
        println(myDate.formatSize)
    }
}