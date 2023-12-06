package com.example.cetpatrainingproject.day3

fun main() {

    val a = 40
    val b = 20
    val c = 30
    // find max value
    val max = if(b>a) if (b<c) c else b else if (a>c) a else c

    println(max)

    val result = if(a in 1..5) { // first conditions
        5
    } else if (a in 5..10) { // second conditions
        10
    } else { // third conditions
        a
    }
    println(result)



    // without block - for single line you can use

   // var result = if(20>10) 20 else 10   // if {} else {}

    // with block
//    var resultBlock = if(20>10) {
//        println(20)
//        20
//    }else {
//        println(10)
//        10
//    }

//  var result =  if (20>10) {
//        println(20)
//        20 //
//
//    }else {
//        println(10)
//      10
//    }
//    println(result)
//
}