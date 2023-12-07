package com.example.cetpatrainingproject.day4

/**
 *
 * 6. Kotlin Inline Function:
 * Inline function marked with keyword inline keyword,
 * Not allocate in memory used to copay code where you call this code.
 *
 *
 * */
fun main() {
    calculation()
}

fun calculation() {
    val sum  = addInline(10,20)
    val m  = multipleInline(10,20)
}



// Inline function will not store or will not create any memory location
inline fun addInline(a:Int,b:Int):Int{
    return a+b
}

inline fun multipleInline(a:Int,b:Int):Int{
    return a*b
}