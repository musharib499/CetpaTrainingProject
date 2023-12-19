package com.example.cetpatrainingproject.day12


fun main() {

    var str:String = "My; name; is ali; "

    val result = str.removeSemicolan()

    println(result) // "My name is ali"


    val first = 10
    val resultNumber = first.addTowNumber(20)
    println(resultNumber)

}


fun String.removeSemicolan():String {
   return this.replace(";","")
}

fun Int.addTowNumber(b:Int):Int {
    return this + b
}



