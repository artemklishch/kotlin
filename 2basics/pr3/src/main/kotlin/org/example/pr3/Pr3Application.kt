package org.example.pr3

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr3Application

const val TYPE = "USUAL" // constanta
const val PERSONS = 4
const val COINS = 10

fun main() {
//    println(TYPE)
    println(COINS % PERSONS)
    println("\n")

    val name = "Alice"
    println(name)
//    println(name.toUpperCase()) deprecated methods
//    println(name.toLowerCase())
    println(name.uppercase())
    println(name.lowercase())
    println(name)

    val name2 = "bob"
//    println(name2.capitalize()) deprecated methods
//    println(name2.decapitalize())
    println(name2.replaceFirst(name2[0], name2[0].uppercaseChar())) // Bob

    println(name.dropLast(2)) // Ali

    println(name.drop(1).dropLast(1)) // lic

    println(name.take(2)) // Al

    val name3 = "al1c3"
    println(name3.filter { c -> c.isDigit() }) // 13

    val rotator = "rotator"
    val adc = "abc"
    println(isWerewolf(rotator)) // true
    println(isWerewolf(adc)) // false
}

fun isWerewolf(value: String): Boolean {
    return value.reversed() == value
}
