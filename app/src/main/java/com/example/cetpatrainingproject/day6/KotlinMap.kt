package com.example.cetpatrainingproject.day6

// Maps - two parts - key m value. We can say collection of key - value pairs,
// Keys - Uniques // contains null if you need
// Value - duplicates
// Immutable ot mutable

/// Immutable
// mapOf()

fun main() {
    // Key - value
    val immutbalMap = mapOf<Int,String>(
        1 to "Sachin",
        2 to "Sanya",
        3 to "Arif",
        4 to "Hello"
    )


    println(immutbalMap[4]) //
    println(immutbalMap.size) //

    val mutbalMap = mutableMapOf<Int,String>().apply {
        put(1, "Sachin")
        put(2, "Sachin")
        put(3, "Sachin")
        put(4, "Sachin")
        put(5, "Sachin")
    }

    mutbalMap.put(1,"")
    mutbalMap[2] = "Bye"
   println(mutbalMap.contains(2))
   println(mutbalMap.contains(10))
   println(mutbalMap.containsKey(10))


    val name = mutbalMap.getValue(2)
    println(name)
    println("Map Keys -${mutbalMap.keys}")
    println("Map Values -${mutbalMap.values}")

}

