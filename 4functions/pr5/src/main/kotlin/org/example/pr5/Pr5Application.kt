package org.example.pr5

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr5Application

fun main() {
    printMessage("Bob")

    val lam1 = { name: String -> println("Hello, $name") } // lambda function, consumer
    val lam11: (String) -> Unit = { name -> println("Hello, $name") } // lambda function, consumer
    lam1("John") // "Hello, John"

    println("\n")

    val lam2: () -> Unit = { // lambda function, doesn't take params and doesn't return value, like Runnable in Java
        println("Hello, mates!")
    }
    lam2() // "Hello, mates!"

    println("\n")

    val lam3: (Int) -> Int = { number -> // lambda function, Functional interface
        number * number
    }
    println(lam3(3)) // 9

    val lam4: (Int, Int) -> Int =
        { num1, num2 -> num1 + num2 } // (num1, num2) -> num1 + num2 - brackets cause compile error
    println(lam4(3, 3)) // 6

    println("\n")

    sayHello(
        arrayOf("John", "Denise", "Alice"),
        lam11
    )
    println("\n")
    sayHello(
        arrayOf("John", "Bob", "Alice"),
        { name: String -> println("Hello, $name") }
    )
    println("\n")
    sayHello(
        arrayOf("John", "Bob", "Alice"),
    ) { name: String -> println("Hello, $name") } // this is also working syntax

    println("\n")
    println(opposite(5))
    val opposite1 = { number: Int -> -number }
//    val opposite1 = { number: Int -> number * -1 }
//    val opposite1 = { number: Int -> number.unaryMinus() }
    val opposite11 = Int::unaryMinus // the same
    println(opposite1(55))
    println(opposite11(66)) // -66

}

fun printMessage(name: String) {
    println("Hello, $name")
}

fun sayHello(names: Array<String>, sayWelcomeMessage: (String) -> Unit) { // the second parameter is callback
    for (name in names) {
        sayWelcomeMessage(name)
    }
}

//fun opposite(number: Int): Int {
//    return -number
//}

fun opposite(number: Int): Int = -number
