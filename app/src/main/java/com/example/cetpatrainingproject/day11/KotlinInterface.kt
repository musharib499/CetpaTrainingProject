package com.example.cetpatrainingproject.day11

import com.example.cetpatrainingproject.day12.removeSemicolan


// How create interface? define keyword as interface
// Interface did not have any constructor .
// You can not create instance of interface
// You can define and declare method and properties
// By default


open interface A {}
open interface C {}
interface B :A,C {

}

interface CalculaterInterface {

    fun add(a:Int,b:Int):Int
    fun subTract(a:Int,b:Int):Int
    fun multiple(a:Int,b:Int):Int { // this define - you given definition
        return a+b
    }
}

class Calculater:CalculaterInterface {
    override fun add(a: Int, b: Int): Int {
        return a+b
    }

    override fun subTract(a: Int, b: Int): Int {
        return a-b
    }

    override fun multiple(a: Int, b: Int): Int {
       // return super.multiple(a, b)
        return a*b
    }


}


class MyCale: CalculaterInterface {
    override fun add(a: Int, b: Int): Int {
        TODO("Not yet implemented")
    }

    override fun subTract(a: Int, b: Int): Int {
        TODO("Not yet implemented")
    }

}








fun main() {

    val instance  = Calculater()
    println(instance.add(10,20))
    println(instance.multiple(10,20))
}
