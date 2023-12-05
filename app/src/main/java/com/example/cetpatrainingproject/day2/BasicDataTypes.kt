package com.example.cetpatrainingproject.day2

fun main() {
  var number:Byte = 1

  println(number::class.simpleName)
  println("Characters  $charType") // a
  println("Boolean - $booleanType") // false
  println("String - $stringTypes") // false
  println("Short Convert into Int - ${shortNumber.toInt()} , ${shortNumber.toInt()::class.simpleName}") // false
}

///
val number :Int = 10
val byteNumber: Byte = 1
val shortNumber:Short = 10
var floatNumber:Float = 10.0F
var doubleNumber:Double = 10.0


// Characters

val charType:Char = 'A' //

// boolean

val booleanType : Boolean = false

// String

val companyName = "Cetpa"

val stringTypes:String = "Welcome on $companyName $doubleNumber Traning"





