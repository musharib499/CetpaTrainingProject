package com.example.cetpatrainingproject.day10

import java.util.Objects

 class CetpaClass : CetpaBaseClass , CetpaInterface { // Primary constructors Define in class header

    // Primary constructors will execute first
    // init block will second
    // Second constructor will execute third
    init {
        println("CetpaClass created")
    }

     override fun addStudent() {
     }

   private constructor(firstName: String, list: List<Int>, userInfo:UserInfo, className:String){

    }
    constructor()





    companion object {
        private var instance:CetpaClass? = null

        fun getInstance(): CetpaClass {
            if (instance == null) {
                instance = CetpaClass()
            }
            return instance as CetpaClass
        }
    }





    fun getObjectFunction() = object  {
        val name :String = "Hello"

        override fun toString(): String {
            return name
        }

    }



}



data class UserInfo(val name:String, val age:Int)