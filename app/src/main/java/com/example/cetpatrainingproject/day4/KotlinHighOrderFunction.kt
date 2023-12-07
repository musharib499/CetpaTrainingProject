package com.example.cetpatrainingproject.day4

/**
 * 5. Higher-order Function: /
 * Defining higher-order functions and their characteristics.
 * Passing functions as parameters and returning functions.
 * Examples illustrating the power and flexibility of higher-order functions.
 *
 *
 * */


// you not pass function as arugument(parameters) in normal function - normal function
fun normalFunction(a: Int, b: Int): Int {
    return a + b
} // fixed

// High  order function also a function - pass as argument as function and return result as function

// lamda expression passing in format argument in function
fun highOrderFunction(a: Int, b: Int, operation: (Int, Int) -> Int): Int = operation(a, b)

fun main() {
    val sum = highOrderFunction(operation = { a, b -> a + b }, b = 20, a = 10)
    println(sum)
    val multiple = highOrderFunction(a = 10, operation = { a, b -> a * b }, b = 20)
    val divide = highOrderFunction(a = 10, operation = { a, b -> a / b }, b = 20)
    println(multiple)
    println(divide)

}

