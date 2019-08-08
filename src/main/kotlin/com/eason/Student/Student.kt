package com.eason.Student

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter Student's name: ")
    var name = scanner.next()
    print("Please enter Student's english: ")
    var english = scanner.nextInt()
    print("Please enter Student's math: ")
    var math = scanner.nextInt()

    val stu = Student(name , english, math)
    stu.print()
}


class Student(var name:String, var english:Int, var math: Int) {
    fun print(){
        println(name +"\n"+ english + "\t" + math + "\t"+ "平均分數: "+(english+math)/2)

    }

}