package com.eason

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//        Human().hello()
        val h = Human()
        h.hello()
        var age = 19    //val 不可再改變
        age = 20
        var weight = 66.5
        val String = "Eason"
        val name : String
        name = "Eason2"
}

class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}