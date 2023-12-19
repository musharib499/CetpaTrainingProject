package com.example.cetpatrainingproject.day12

data class MyData(val name: String, val address:String) {
}

fun main() {
    val myData = MyData("Sachin", "Noida")

    println(myData.name) // "Sachin"
    println(myData.toString()) // "Sachin"
    println(myData.hashCode()) // 123456
    val copymyData = myData.copy() // no change in any thing // same hashCode // if you change something then it will create new object or data class
    println(copymyData.hashCode()) //
    println(copymyData.toString()) //
}