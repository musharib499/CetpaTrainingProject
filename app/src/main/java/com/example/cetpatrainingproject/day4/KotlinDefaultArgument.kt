package com.example.cetpatrainingproject.day4

/**
 *
 *  Default and Named Argument:
 * */


fun main() {
    //add(a = 20)// it required parms arguments
    greetingMessage(age = 24, name = "Sachin")
}

fun add(a:Int, b:Int = 10) {
    var result = a+b
    println(result)
}

fun greetingMessage(name:String , message:String = "Welcome") {
    // if not make any default value should we need pass both value
    // if you make default value not required pass default value it will take default value
    println("$message - $name")
}

fun greetingMessage(age:Int, name:String , message:String = "Welcome") {
    // if not make any default value should we need pass both value
    // if you make default value not required pass default value it will take default value
    println("$message - $name - $age")
}