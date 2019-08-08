package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets: ")
        var number = scanner.nextInt()
    println("How many round-trip tickets: ")
        var roundtrip = scanner.nextInt()
    val ticket = Ticket(number,roundtrip)
    ticket.print()
}

class Ticket(var number:Int, var roundtrip: Int){
    fun print(){
        println(((number-roundtrip)*1000)+(roundtrip*2000*0.9))
    }
}
