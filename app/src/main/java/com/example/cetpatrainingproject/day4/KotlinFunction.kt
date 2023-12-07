package com.example.cetpatrainingproject.day4

import java.util.function.BinaryOperator

/**
 * 1. Kotlin Function:
 * Introduction to functions in Kotlin.
 * // Function are used to encapsulated a piece of behavior that can executed multiple times. Function can accepts input parameters,
 * // returns values and proved a way to encapsulate complex logic and reusable block of code.
 *
 *
 *
 * Syntax for declaring and invoking functions.
 * // Kotlin i used to define function by keyword fun
 * // fun name() {}
 * // return function -
 * fun name():Int {
 *   return a*b
 * }
 * */

fun main() { // function

   // sum(10,20)
   // val result = sumTwoNumber(20,40)
    //println(result)
    val calculation = numberCalculate(12,6, 'A')
    println(calculation)
    println(sumTwoNumber1(20,30))

}


fun sum()  {} //  body - block which execute piece of code // not arrgument pass
fun sum(a:Int,b:Int)  { // body - block which execute piece of code
    println(a+b)
}

// Any - any type object
fun sumTwoNumber(a:Int,b:Int):Int  { // body - block which execute piece of code
    return a+b
}

fun sumTwoNumber1(a:Int,b:Int):Int  = a+b


fun numberCalculate(a: Int,b: Int, operator: Char) :Any {
    return  when (operator) {
        '+' -> a+b
        '-' -> if (a>b) a-b else b-a
        '*' -> a*b
        else -> "No passing any operator"
    }
}






