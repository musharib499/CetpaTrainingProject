package com.example.cetpatrainingproject.day4


/**
 * 2. Recursion Function: That call itself (self calling)
 * Understanding recursive functions.
 * Exploring the concept of a function calling itself.
 * Examples illustrating recursive function design and implementation.
 **/
fun main() {
    val output = factorial(5)
    println(output) // 120

    for (i in 1..10) {
        val fib = finbonacci(i)
        println(fib)
    }

   // println(fib) // 0,1,1,2,3,5,8
}
// first letter small, second word letter will caps

//  That call itself (self calling)
// 5*4*3*2*1 = 120 factorial
fun factorial(n:Int):Int {
    val value = if (n == 0 || n == 1) 1 else n * factorial(n-1)
    return value
}


fun finbonacci(n:Int):Int {
  return if (n<=1) n else finbonacci(n-1) + finbonacci(n-2)

}
