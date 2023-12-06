package com.example.cetpatrainingproject.day3

//  Kotlin for Loop: , for, While, Do, forEach

// for or forEach // Equivalent

fun main() {
    // For Loop
    // How do define for loop body
    // for(i in 1..10){ block }
    //
    // for(i in 1 untils 10){ block }
    // for(i in 1 downTo 10){ block }

    println("For loop with oprator")
    for (item in 1..10) {
        println(item)
    }

    println("For loop with until")
    for (item in 5 until 10) { // increasing order
        println(item)
    }

    // Decreasing order

    println("For loop with Decreasing order")
//    for (item in 10..1) { // Error will not print
//        println(item)
//    }
    for (item in 10 downTo 1) { // Decreasing order
        println(item)
    }

    println("For each loop")

    val string = "Cetpa training"

    string.forEach {
        println(it)
    }
    // how to find index

    string.forEachIndexed() { index, char->
        println("$char- $index")

    }




}



