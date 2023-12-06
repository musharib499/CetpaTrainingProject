package com.example.cetpatrainingproject.day3

// Kotlin have 3 structural jump expression
// 1. return, 2.break, 3.continue
// return -> if meet condition enclose function
// break - terminate // 1. Use direct, 2 With scoop // Any expression in kotlin may be marked with label (@, take loop@)
// continue - 1.....10 = next steps will execute


fun main() {
//    val a = 5
//    if (a == 5) {
//        println("return execute")
//        return
//    } else  {
//        println(a)
//    }

//    for (i in 0..10) { // 0,1,2,3,4,5,6
//        if (i == 7 ) return
//        else println(i)
//    }

    // break - terminate = they have scope


    loop@ for (j in 1..10) {
         for (i in 1..10) {
            if (j == 7) break@loop // your defining scoop..
            else print(i)
        }
        println()
    }

    // Continue
    println("Continue")
    loop@ for (j in 1..10) {
        println()
        for (i in 1..10) {
            if (i == 7) continue@loop // Skip
            else print(i)
        }
    }






}