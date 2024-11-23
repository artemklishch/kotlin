package org.example.pr5

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr5Application

fun main() {
    var num1 = 10
    val num2 = 15
    println(num1 + num2)
    println(num1 * num2)
    println(true || false)
    println(true && false)
    ++num1
    println(num1)


}
