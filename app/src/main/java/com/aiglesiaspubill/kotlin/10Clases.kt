package com.aiglesiaspubill.kotlin

class `10Clases`(val name: String, val age:Int, val languages:Array<Language>, val friends: Array<`10Clases`>? = null) {

    enum class Language {
        INGLES,
        CATALAN,
        CASTELLANO
    }
    fun getLanguages() {
        for(language: Language in languages) {
            println("Hablo muy bien $language")
        }
    }
    }