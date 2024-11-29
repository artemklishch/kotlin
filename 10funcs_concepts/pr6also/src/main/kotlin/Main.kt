package org.example

fun main() {
    Car().apply {
        speed = 90
        color = "red"
        startCar()
    }.also {
        println("The car is driving")
        println("Car info: speed is ${it.speed}")
    }

    Book().apply {
        title = "Nice book"
        printBook()
    }.also {
        println("LOG: printing teh book $it")
        println("Sending email about the book $it")
    }
}

class Car {
    var speed = 10
    var color = "blue"
    fun startCar() {
        println("Starting the car, speed is $speed, color is $color")
    }

    override fun toString(): String {
        return "Car(speed=$speed, color='$color')"
    }

}

class Book {
    var title = ""
    fun printBook() {
        println("Printing the book")
    }

    override fun toString(): String {
        return "Book(title='$title')"
    }
}
