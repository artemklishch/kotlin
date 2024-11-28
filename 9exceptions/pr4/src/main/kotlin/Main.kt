package org.example

// Створюємо власне виключення, яке успадковує Exception
class CustomException(message: String) : Exception(message)

// Метод, який кидає наше власне виключення
fun riskyMethod() {
    throw CustomException("Custom error occurred in Kotlin")
}

fun main() {
    try {
        riskyMethod()
    } catch (e: CustomException) {
        println("Caught custom exception: ${e.message}")
    }
}
