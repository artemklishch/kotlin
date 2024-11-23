package org.example.pr2

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr2Application

fun main() {
    printNumberInfo(6)
    printNumberInfo(50)
    printNumberInfo(12)
    printNumberInfo(11, "The prime number is:")

    println("\n")

    formatMessage("Anna", "London", 30)
    formatMessage(location = "Kyiv", name = "Bob", age = 30) // named parameters
}

fun printNumberInfo(number: Int, message: String = "The number is - ") { // default value for the "message" parameter
    println("$message $number")
}

fun formatMessage(name: String, location: String, age: Int) {
    println("$name from $location is $age years old")
}
