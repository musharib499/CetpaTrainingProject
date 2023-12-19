package com.example.cetpatrainingproject.day11


fun main() {
    // val animal = Animal() // We can not access directly we need to extend this class
    val animalActivity = AnimalActivity("Cow") //
     animalActivity.animalLegs(4)
    println(animalActivity.animalType()) //

}


class AnimalActivity : Animal {

    constructor(animalName: String,animalLegs:Int) : super(animalName,animalLegs) {
        println("AnimalActivityp constractor")
    }
    constructor(animalName: String) : super() {
        println("AnimalActivityp $animalName")
        animalLegs(4)
    }


    override fun eatType(): String {
       return "Grass"
    }




}

abstract class Animal(){
    private var legs :Int = 0


    abstract fun eatType():String //

    open fun animalLegs(legs:Int) {
        this.legs = legs
    }
    //abstract fun eatType():String //
    open fun animalType():String {
        return  when(legs) {
            4 -> "4 Legs Animals"
            2 -> "2 Human"
            else -> "Unknown"

        }
    }
    init {

        println("Init block") //
    }

    init {

        println("Init block1") //
    }
    init {

        println("Init block2") //
    }
    init {

        println("Init block3") //
    }




//    constructor(animalName: String) {
//        println("Animal $animalName")
//    }
    constructor(animalName: String,animalLegs:Int) : this() {
        println("constructor- second")

    }
    init {

        println("Init block4") //
    }

    constructor(animalName: String,animalLegs:Int, type:String) : this() {
        println("constructor- constructor")
    }

}

// Class  - contractor - class can create instance of class
// Abstract - cont
// Primary - init - secondary constructor will call