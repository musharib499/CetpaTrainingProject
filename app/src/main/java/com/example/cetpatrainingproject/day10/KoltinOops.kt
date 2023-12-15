package com.example.cetpatrainingproject.day10

fun main() {

    // When you will create class with pass some param. we need to define at initlization time
    var cetpaClass = CetpaClass.getInstance()
    println("cetpaWithSingletonClass - ${cetpaClass.hashCode()}")
    var secondClas = CetpaClass.getInstance()
    println("cetpaWithSingletonClass - ${secondClas.hashCode()}")

    // Without singleton access object

    var cetpaWithOutSingletonClass = CetpaClass()
    println("cetpaWithOutSingletonClass - ${cetpaWithOutSingletonClass.hashCode()}")
    var secondWithOutSingletonClasa = CetpaClass()
    println("cetpaWithOutSingletonClass - ${secondWithOutSingletonClasa.hashCode()}")


    // cetpaClass = CetpaClass("Asif", listOf(),UserInfo("Sachin", 30), "")


    val kotlinObject1 = KoltinObject
    val kotlinObject2 = KoltinObject

    println("By Object ${kotlinObject1.hashCode()}")
    println("By Object ${kotlinObject2.hashCode()}")


}


internal val  internalVariable:String?  = null






// 434091818
//434091818
