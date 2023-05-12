package com.aiglesiaspubill.kotlin.kotlin17.`typealias`


typealias MyMapList = MutableMap<Int, ArrayList<String>>
typealias MyFun = (Int, String, MyMapList) -> Boolean

class EjemplosTypeAlias {

    //EJEMPLO 1
    private var myMap: MutableMap<Int, ArrayList<String>> = mutableMapOf()


    private fun typeAliasEjemplo1() {
        var myNewMap: MyMapList = mutableMapOf()
        myNewMap[1] = arrayListOf("Brais", "Moure")
        myNewMap[2] = arrayListOf("Aitor", "Iglesias", "Pubill")

        myMap = myNewMap

    }

}