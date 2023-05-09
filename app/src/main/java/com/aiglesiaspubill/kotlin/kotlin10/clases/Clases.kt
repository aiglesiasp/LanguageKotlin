package com.aiglesiaspubill.kotlin.kotlin10.clases

class Clases(val name: String, val age:Int, val languages:Array<Language>, val friends: Array<Clases>? = null) {

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