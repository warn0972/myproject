package com.eason

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//        Human().hello()
        val h = Human(weight = 66.5f,height = 1.7f)
        println(h.bmi())
        h.hello()
        val score = 88
        println(score >80)
        val c:Char = 'A'
        println(c.toInt()>60)
        /*var age = 19    //val 不可再改變
        age = 20
        var weight = 66.5
        val String = "Eason"
        val name : String
        name = "Eason2"*/
}

class Human(var name: String = "",var weight:Float, var height:Float){
    init {
        println("test $weight")
    }

    fun bmi(): Float {
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}