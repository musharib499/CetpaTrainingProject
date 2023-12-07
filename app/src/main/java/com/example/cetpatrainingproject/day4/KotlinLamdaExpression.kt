package com.example.cetpatrainingproject.day4

/**
 * 4. Kotlin Lambdas:
 * Introduction to lambda expressions in Kotlin. //
 *
 * Syntax and application of lambdas.
 * val name: (any daya types)-> Unit  = { anytype ->
 *
 * }
 * Examples demonstrating concise and expressive lambda usage.
 *
 * */

val add1:(Int, Int, Char)->Int  = {a, b, o ->
    when(o){
        '+' -> a+b
        '*' -> a*b
        else -> a/b
    }
}
//
//val nameOfFunction: (Int, Int,Int) ->String = {a,b,c->
//    var d = a+b+c
//    "$d"
//}
//
//val name:(Int, String) -> Result type = {a,str-> ""}




fun main() {
    val value = add1(10,20 ,'*')
    println(value)
}
//



