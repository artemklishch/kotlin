package org.example.pr2

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr3Application

fun main() {
    configureProfile("John")
    configureProfile("Ann", 23)
    configureProfile("Bob", 25, true)
}

@JvmOverloads // ця анотація робить автоматичне перевантаження методів при компіляції в Java код
fun configureProfile(name: String, age: Int = 30, isAdmin: Boolean = false) {
    println("User details: name = $name, age = $age, isAdmin = $isAdmin")
}
