package org.example

fun main() {
    val car = Car()
    car.speed = 80
    car.drive()
    println("The car is driving")

    with(Car()) {
//        this.speed = 80 // this не обов'язково вказувати
        speed = 80
        drive()
        println("The car is driving")
    }

    println("\n")

    val person = Person()
    with(person) {
        firstName = "Peter"
        lastName = "Michelson"
        age = 20
        printPersonInfo()
    }
//    person.let { // технічно це також працює, але якщо хочемо оновлювати дані об'єкта - то використовуємо with
//        it.firstName = "Peter"
//        it.lastName = "Michelson"
//        it.age = 20
//        it.printPersonInfo()
//    }
}

class Car {
    var speed = 50

    fun drive() {
        println("Driving at speed: $speed")
    }
}

class Person {
    var firstName = ""
    var lastName = ""
    var age = 0

    fun printPersonInfo() {
        println("$firstName $lastName is $age years old")
    }
}