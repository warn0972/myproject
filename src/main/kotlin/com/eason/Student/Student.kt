package com.eason.Student

fun main(args: Array<String>) {
    val stu = Student("Eason", 80, 66)
    stu.print()
}


class Student(var name:String, var english:Int, var math: Int) {
    fun print(){
        println(name +"\n"+ english + "\t" + math + "\t"+ (english+math)/2)

    }

}