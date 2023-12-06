package com.example.cetpatrainingproject.day3

// When Expression - When is defines a conditional expression with multiple conditions or branches .
// It look line similar switch

//// switch(a) {
//
//    case : a == 1 {
//
//    }
//// }

fun main() {
//    val a = 7
//    val result = when(a) { // first conditions // if you using any conditions
//        5 -> 25 //
//        10 -> 100
//        7 -> 49
//        8 -> 64
//        11 -> 121
//        7.0 ->
//        else -> a*a
//    }
//    println(result)

    val value:Any = 1.2234455666
    when(value) { // first conditions // if you using any conditions
        is String ->  println("This String")
        is Int -> println("This int")
        is Float -> println("This Float")
        else -> println("Undefine value")
    }
}


// structure

//when(x) {
//    else -> {} // if you need only one line code not required block
//}



