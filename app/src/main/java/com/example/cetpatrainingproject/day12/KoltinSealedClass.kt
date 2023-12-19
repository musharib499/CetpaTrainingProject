package com.example.cetpatrainingproject.day12


// Sealed class itself as abstract
// We can not create a instance
// SubClass have multiple instance

// Benefit
// 1.Restricted Inheritance
// 2.Compile time safety
// 3.Improve code structure
// 4.Smart Cast

sealed class Error
class NetWorkError(): Error()
class Success(): Error()
class Failuer(): Error()



fun apiFunction(error: Error):String {
   return when(error) {
        is NetWorkError -> {"Network error"}
        is Success -> {"Response Success"}
        is Failuer -> {"Response failure"}
       else -> "Unknown"
   }
}




fun main() {
    apiFunction(NetWorkError()).apply {
        println(this)
    }
    apiFunction(Success()).apply {
        println(this)
    }
    apiFunction(Failuer()).apply {
        println(this)
    }

}

