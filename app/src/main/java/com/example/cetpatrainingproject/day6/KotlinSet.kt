package com.example.cetpatrainingproject.day6

// Set - Unordered collection of unique elements
// Immutable or Mutable
// Immutable
// How can define immutable? - setOf()
// How can define mutable? - mutableSetOf(),hashSetOf()


fun main() {

    println(".....................Immutable set...........")
    val immutableSet = setOf<Int>(1,2,3,4,4,5,1,10,11,10)

    immutableSet.forEach {
        println(it)
    }
    // Remove all duplicate value
    val list = listOf<Int>(1,2,3,4,4,5,5,6)
    val noDuplicateValue = list.toSet()
    list.forEach { println(it) }
    println("Remove duplicate")
    noDuplicateValue.forEach { println(it) }

    println(".....................Mutable set...........")
   val mutableSet = mutableSetOf<Int>(1,2,4,5,6)
    mutableSet.add(10)
    mutableSet.forEach {
        println(it)
    }

    println(".................Add all element.........")
    var newSet = setOf<Int>(100,300,400)
    mutableSet.addAll(newSet) //
    mutableSet.forEach {
        println(it)
    }




}