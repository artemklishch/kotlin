package org.example

fun main() {
    val car1 = Car().run {
        speed = 80
        drive()
        println("The car is driving...")
        this
    }
    println(car1.speed) // 80

    run { // просто створює блок коду, в якому ми створюємо обгортку з своєю областю видимості
        val car2 = Car()
        car2.speed = 90
        car2.drive()
        println(car1.speed) // 80
    }

    println("\n")

    val rest = Restaurant().run {
        standardDish = "Fish and chips"
        todaySpecial = "Fillet mignon"
        printMenu()
        this
    }
    println(rest)
}

class Car {
    var speed = 50

    fun drive() {
        println("Driving at speed: $speed")
    }
}

class Restaurant {
    var standardDish = ""
    var todaySpecial = ""
    fun printMenu() {
        println("The standard dish is $standardDish")
        println("Today's special is $todaySpecial")
    }

    override fun toString(): String {
        return "Restaurant(standardDish='$standardDish', todaySpecial='$todaySpecial')"
    }
}
