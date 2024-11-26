package org.example

fun main() {
//    val machine1: Machine = Car()
    val machine1: Car = Car() // Car - тип за замовчуванням
    machine1.drive()
}

open class Machine { // усі класи за замовчування - final, тому для наслідування потрібно використовувати ключове слово open
    open fun drive() { // такий метод також final - тому для перевизначення потрібно також використовувати модифікатор open
        println("The machine is ready to drive...")
    }
}

class Car : Machine() {
    override fun drive() {
        println("The car is ready to drive...")
    }
}
