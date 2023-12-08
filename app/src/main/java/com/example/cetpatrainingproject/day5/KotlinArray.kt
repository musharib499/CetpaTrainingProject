package com.example.cetpatrainingproject.day5
/**
 * Kotlin Array - Array in kotlin data structure the hold data same type or fixed number(size)
 * Syntex :  var array = arrayOf()
 * How many type create array function define as - arrayOf(), arrayOfNulls() or emptyArray()
 * Array is constructor
 *
 * */
fun main() {

//    val array = arrayOf("Hello","Bye","Welcome") // mutable you can add and remove value
//    // which type data type using is -> string type
//    // if find any element by index - 2
//
//    // Array index will start from - 0
//    // "Hello" - 0
//    // "Bye" - 1
//    // "welcome" - 2
//   // println(array[2]) // Welcome
//    println(array.joinToString())
//
////    var immutableArray = Array(3) {""} //
////    //
////    // which type data type using is -> string type
////    // if find any element by index - 2
////
////    // Array index will start from - 0
////    // "Hello" - 0
////    // "Bye" - 1
////    // "welcome" - 2
////
////    immutableArray += "Hello"
////    immutableArray += "Bye"
////    println(immutableArray[0]) // Welcome
//
//
//    var arrayNull = arrayOfNulls<Int>(5) //
//    val size = 5
//    var arrayNull1: Array<Any?> = arrayOfNulls(size) // Should define data type
//     // Any - Object - any data type , Int, object, String, Long , flot, Double
//
//      // if you not using any type data then need to define data type (Int, String, Float, Long, or Object) - if you using any type you pass any type of data
//
//     arrayNull1 += "hello" // String type
//     arrayNull1 += 10 // Int type
//     arrayNull1 += ArrayDataClass("Sachin") //  data types
//     arrayNull1 += 10.0F //  float types
//    //println(arrayNull)

    //printAllInputValue()

    // arrayOfNulls() - default value will take as null. if not passing any default value
    var arrayNull = arrayOfNulls<Int>(3) // 0, 1,2
    var arrayNull1: Array<Int?> = arrayOfNulls(3) // 0, 1,2 // both are same
    arrayNull += arrayOf(100, 200) // add new array in bottom //
    arrayNull[2]= 5000 // I want to add exiting in index
    arrayNull[1]= 6000 // I want to add exiting in index - 1
    arrayNull[1]= 6000 // I want to add exiting in index - 1
    println(arrayNull.joinToString())

    // emptyArray() // this function use to create empty function
    println("..........................Empty Array......................")
    var emptyArray = emptyArray<Int>()  // Just create simple array with empty
    println("empty array size ${emptyArray.size}")

    println(emptyArray.joinToString())
    emptyArray += arrayOf<Int>(100)
    println(emptyArray.joinToString())

    emptyArray[0] = 200

    println(emptyArray.joinToString())
    println("empty array size ${emptyArray.size}")
    val list = mutableListOf<Int>()
    list.add(12)
    list[0] = 30

    println("empty array size ${list}")
    println("..........................Nested Array......................")
    // Nested Array
    val nestedArray = Array(2){Array<Int>(2){1} }
    println(nestedArray.contentDeepToString())


}

fun printAllInputValue() {
    var stringArray = arrayOf<String>()
    var intArray = arrayOf<Int>()
    var longArray = arrayOf<Long>()
    var anyArray = arrayOf<Any>()

    val inputArray = getInput()
    inputArray.forEach {
        when(it) {
            is Int -> intArray += it
            is String -> stringArray += it
            is Long -> longArray += it.toLong()
            else -> anyArray += it
        }
    }
    stringArray.forEach {
        println("String - $it")
    }

    intArray.forEach {
        println("Int - $it")
    }

    longArray.forEach {
        println("Long - $it")
    }

    anyArray.forEach {
        println("Any - $it")
    }

}


fun getInput(): Array<Any> {
    println("Please enter numbers")
    var number = readln().toInt()
    var array = arrayOf<Any>(number)
    while (number>=0) {
       println("Please enter data types")
       val inputValue = readln().toInt()
       array += when(inputValue) {
           1 -> {
               println("Please enter int value")
               readln().toInt()
           }

           2 -> {

               println("Please enter string value")
               readln().toString()
           }

           3 -> {
               println("Please enter long value")
               readln().toLong()
           }

           else -> {
               println("Please enter long value")
               readln().any()
           }
       }
        number--


    }

    return array

}




data class ArrayDataClass(val name:String){}