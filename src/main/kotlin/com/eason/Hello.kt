package com.eason

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//        Human().hello()
        val h = Human(66.5f,1.7f)
        println(h.bmi())
        h.hello()
        /*var age = 19    //val 不可再改變
        age = 20
        var weight = 66.5
        val String = "Eason"
        val name : String
        name = "Eason2"*/
}

class Human(var weight:Float, var height:Float){
    fun bmi(): Float {
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}