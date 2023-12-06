package com.example.cetpatrainingproject.day3


// While Loop -> While and do-while loops execute their body continuously while their condition is satisfied

// While  Loop - First check conditions and if it is satisfied . then execute block

// while() {}

// do-while - executed the body and then check the condition if it satisfied
// do {body} while( condition)



fun main() {
    /*................................while loop.............................*/
    // Increasing order
//    var i = 0
//    while(i<=10) {
//        println(i)
//        i++
//    }

    // Decreasing order
    println("Decreasing order")
    var i = 10
    while(i>=0) {
        println(i)
        i--
    }

    /*.......................................do while..................*/
    // do While
    // Increasing order
    println("Do while increasing order")
    var j = 0
    do{
        println(j)
        j++
    } while (j<10)

    println("Do while Decreasing order")
    var k = 10
    do{
        println(k)
        k--
    } while (k>=0)

}