package org.example.pr3

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr3Application

fun main(args: Array<String>) {
    println("Enter your name ...")
    // для звичайного Java
//    Scanner scanner = new Scanner(System.`in`)
//    String name = scanner.nextLine()

    val name = readLine() // prompt in terminal
//    println("Hello, " + name + "!")
    println("Hello, $name!")
}
