package org.example.pr6

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr6Application

fun main() {
    val num1 = 3
    val res1 = when (num1) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Unknown number"
    }
    println(res1)

    val num2 = 2
    val res2 = when (num2) {
        1, 2, 3 -> "Between 1 and 3"
        else -> "Outside the range"
    }
    println(res2)

    val num3 = 31
    val res3 = when {
        num3 in 1..5 -> "Between 1 and 5"
        num3 % 2 == 0 -> "An even number"
        num3 is Int -> "Is an Integer"
        else -> "Unknown number"
    }
    println(res3)
}
