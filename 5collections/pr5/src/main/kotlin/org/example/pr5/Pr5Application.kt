package org.example.pr5

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr5Application

fun main() {
    println(simpleMultiplication(10))
    println(simpleMultiplication(5))
}

fun simpleMultiplication(n: Int): Int {
//    if (n % 2 == 0) {
//        return n * 8
//    }
//    return n * 9
    return n * if (n % 2 == 0) 8 else 9 // конструкція if - вираз, який визначає множник для множення
}

fun simpleMultiplication1(n: Int): Int = if (n % 2 == 0) {
    n * 8
} else {
    n * 9
}

fun simpleMultiplication2(n: Int): Int = if (n % 2 == 0) n * 8 else n * 9