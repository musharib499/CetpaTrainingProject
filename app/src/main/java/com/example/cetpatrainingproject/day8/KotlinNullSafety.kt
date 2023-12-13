package com.example.cetpatrainingproject.day8

import com.example.cetpatrainingproject.day7.UserData
import java.lang.Exception

fun main() {
    println("...............Nullable..............")
    // Nullable - we can assign null
    var nullable:String? = null
    println(nullable)

    println("...............Non-Nullable..............")
    // Non-Nullable - we can not assign null
    var nonNullable:String  = "123"// give to security you will not declear null or value is man

    println(nonNullable)
    // val - immutable, var - mutable you can assign value later

    println("................... Safe Call (?.)...............................")
    // Safe Call (?.) - it used to invoke a method(function,object) or access a property only it the receiver is non-null if receiver is null then result will be null
    //?. - safe call
    nullable = "Sachin"
    val length:Int? = nullable?.length // if(nullable == null) 0 else nullable
    println(length)


    println("................... Elvis Operator (?:)...............................")

    //Elvis Operator (?:) - If found null then provide default value if you want

    val elvisName:Int? = null

    // How to return default value if found null
    // value?: default value

    println(elvisName?:2000)


    println("...................Safe Casts('as?')...............................")
    // casting = as - it will not return default value
    // as? - it will return null
    val stringValue :Any = "Hello, My name is .."
    // Any


    val castedString = stringValue as String
    println("String - $castedString")

    val castedInt = stringValue as? Int
    println(castedInt)
    try {
        val castedInt = stringValue as Int
        println(castedInt)
    }catch (e:Exception) {
        println(e)
    }


    println(".....................!! Operator (Non-null Assertion)....................")

    val nullableString:String? = null
    val userData:UserData? = null
    // null .. length

//    val assertionValue = nullableString!!.length // nullable into non-nullable
//    println(assertionValue)

   // println(userData!!.name)

    println(".........................Let Function.........................")

    val userDataLet:UserData? = UserData("Name", 20)

    userDataLet?.let {
        println(it.name)
        println(it.age)
    }





}