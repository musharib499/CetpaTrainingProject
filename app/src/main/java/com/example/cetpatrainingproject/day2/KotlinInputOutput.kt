package com.example.cetpatrainingproject.day2

fun main() {

    // I take input as string
//    println("Please enter Name :")
//   // val name  = readln()
//    println("Please enter age : ")
    //val age  = readln().toIntOrNull()
    println("Please enter address : ")
    val address  = readln()
   /* println("Name : $name")
    println("Age : ${age.toString()}")
    println("Array : ${address[0]}")*/


    /* This function use for take by user
    * As take input as array
    *
    *
    *
    *
    * */
    println("Please enter array length")
    var length = readln().toIntOrNull() ?:0
    var array :Array<String> = Array(length) {""}
    var i =0
    while (length>0) {
        array[i++] = readln()
        length--
    }

    println(array[0])

}

