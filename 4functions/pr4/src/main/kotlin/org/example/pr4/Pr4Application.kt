package org.example.pr4

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr4Application

fun main() {
    print(arrayOf("Cat", "Lion", "Giraffe"))
}

// with local functions - they are nested functions
// локальні функції недоступні поза межами батьківської функції у яку вони вкладені
fun validateUserData(name: String, email: String): Boolean {
    fun isValidName(name: String): Boolean { // local function
        return name.length > 2
    }

    fun isValidEmail(email: String): Boolean { // local function
        return email.contains("@")
    }

    if (!isValidName(name)) {
        println("Name is invalid")
        return false
    }
    if (!isValidEmail(email)) {
        println("Email is invalid")
        return false
    }
    return true;
}

fun print(animals: Array<String>) {
    fun printAnimalInfo(animal: String) {
        if (animal.length < 5) {
            println("I am ${animal.uppercase()}")
        } else {
            println("I am $animal")
        }
    }

    for (animal in animals) {
        printAnimalInfo(animal)
    }

}

