package com.example.cetpatrainingproject.day6

/** List
 * 1. Ordered collections of element that allow duplicate
 * */
// Immutable- read only - listOf() and list
var immutableList = listOf<String>("Apple", "Banana", "Orange")
var immutableFruitsList = listOf<FruitsData>(
    FruitsData("Apple",10),
    FruitsData("Banana",20),
    FruitsData("Orange",30),
)
data class FruitsData( val fruitName:String,val q:Int)
// mutable- read and write - mutableListOf(), arrayListOf() and ArrayList
var mutableList = mutableListOf<String>("Apple", "Orange", "Banana")
fun main() {
    println("..........................Immutable List...................")
    immutableList = immutableList + listOf("Mango") // two list //
    immutableList.forEach {
        println(it)
    }
    immutableFruitsList.forEach {
        println("${it.fruitName} - ${it.q}")
    }

    val sortList = immutableFruitsList.sortedByDescending { it.q }
    println(sortList)

    println("..........................Mutable List...................")
    mutableList.forEach {
        print("$it,")
    }
    println()
    mutableList.add("Grape") // added new element
    mutableList.forEach {
        print("$it,")
    }
    println("..............................Remove Apple.......................")
    mutableList.remove("Apple")
    println(mutableList.toString())

    mutableList.add("Pineapple")
    println(mutableList.subList(1,2))
//   var sortList = mutableList.sort()
//   println(sortList)
//  val list = listOf<Int>(1,2,3,4)
//  val  list2 = listOf<Int>(5,6,7,8)
//  var flatList  = list.flatMap { list2 }
    getItem(mutableList)
}

fun getItem(list: Collection<Any>? = null) {
    list?.forEach {
        println(it)
    }
}

