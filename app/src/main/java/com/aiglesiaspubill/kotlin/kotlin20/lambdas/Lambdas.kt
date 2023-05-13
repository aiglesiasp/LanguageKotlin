package com.aiglesiaspubill.kotlin.kotlin20.lambdas

import kotlin.concurrent.thread

class Lambdas {

    private fun lambdas() {
        val myIntList = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        // LAMBDA 1
        val myfilterIntList = myIntList.filter {
            it > 5
        }

        //LAMBDA 2
        val myfilterIntListTwo = myIntList.filter { myInt ->

            if(myInt == 1) {
                return@filter true //Incluimos el 1 tambien
            }
            myInt > 5
        }
        println(myfilterIntList)

        // LAMBDA 3
        val mySumFun = fun (x: Int, y:Int): Int {
            return x+y
        }

        val myMultFun = fun (x: Int, y:Int): Int {
            return x*y
        }

        myOperateFun(5, 10) { x, y -> x - y }

        myAsyncFun("Aitor") {
            println(it)
        }
    }

    private fun myOperateFun (x: Int, y:Int, myFun: (Int, Int) -> Int): Int {
            return myFun(x, y)
    }

    private fun myAsyncFun(name: String, hello: (String) -> Unit) {
        val myNewString = "Hello $name"
        thread {
            Thread.sleep(5000)
            hello(myNewString)
        }
    }
}