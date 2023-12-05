package com.example.cetpatrainingproject.day2

fun main() {
  println(resultAND)
  println(resultOR)
  println(resultNOT)

  for (i in rangeNumber) {
    print(i)
  }
}
var a = 10

// Logical Operator AND(&&), OR(||), NOT(!)
var c = false
var b = true
var resultAND  =  c && b // false
var resultOR  =  c || b // true
var resultNOT  =  c != b // true

// Range Operator

val rangeNumber  = 1..10 //