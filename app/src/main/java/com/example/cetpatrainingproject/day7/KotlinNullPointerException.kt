package com.example.cetpatrainingproject.day7

import java.lang.Exception
import java.lang.NullPointerException


// NullPointerException
// val name:String? = null
 data class UserData(val name:String, val age:Int)
// val userData:UserData? = null

// Syntax = try {} catch(e:Exception) {}

fun main() {
    val name:String? = null
    // How to solve this problem
    // 1. Use null check ? - safe call
    // 1. Use null check !! - asserted
    // name -- null allow to access the length

    try {
      val length = name!!.length
        // if(name != null) name.length else null
        println(length)
    }  catch (e:Exception) {
        println("Exception $e")
    } catch (e:NullPointerException) {
        println("NullPointerException $e")
    }
    println("........................NullPointer with data class............................")
    var userData:UserData? = null
    try {
        val name = userData!!.name
    } catch (e:Exception) {
        println(e)
    }


}


