package com.example.cetpatrainingproject.day5

import kotlin.String

// Kotlin String
/**1. An Array of characters is called a string - same as java but added new functionalities in kotlin
 * 2. Kotlin strings are also immutable we can not change the element and length of string
 * 3. Define String in kotlin class - class String : Comparable<String>, CharSequence
* */
// "Most Welcome" - Array of characters - String

//class String : Comparable<String>, CharSequence // "cccccccc" - [c,c,c,c]

fun main() {
  var str = "Most Welcome \n"
    str.forEach {
        println(it) // it will be print every char which in string
        // ['M','o','s'..........]
    }
   // How to get value by Index
   println(str[3])  // t
   println(str.subSequence(0,4))  //
    val number  = 120

  var newStringWithDoller = "Hello ${str.length} ..... $number"

  println(newStringWithDoller)

 var stringBuffer = StringBuffer()
 stringBuffer.append("Hello")
 println(stringBuffer)

 var newStr = "Hello"

// thread1 = same
// thread2 = same //


    // UpperCase
    // lowerCase

    println(newStr.uppercase())
    println(newStr.lowercase())






}