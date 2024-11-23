package org.example.pr4

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr4Application

fun main() {
    val name1 = "Kotlin"
    val greeting1 = "Hello, $name1!"
    println(greeting1)

    val temperature = 23
    val weatherReport = "Temperature is $temperature"
    println(weatherReport)

    val announcement = "Countdown: ${10 - 4} days"
    println(announcement)

    val price = 100
    val discount = 20
    val finalPrice = "Price after discount: ${price - discount}"
    println(finalPrice)
}
