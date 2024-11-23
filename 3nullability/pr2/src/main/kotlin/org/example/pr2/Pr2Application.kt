package org.example.pr2

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr2Application

fun main() {
    println("Print a product info in the format: Name: price. For example, Apple: 11.99")
    val input: String? = readLine()

    val price: Double? = input?.substring(input.indexOf(" ") + 1)?.toDouble()
    val tax = price?.times(0.2)
    println(tax)
}
