package org.example.pr4

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr4Application

fun main() {
    println("Enter the number ...")
    val input: String? = readLine()
//    val number = input?.toInt() // якщо пуста строка - буде помилка java.lang.NumberFormatException
//    val number: Int? = input?.toIntOrNull()
    val number: Int? = if (input != "") input?.toInt() else null
    println("The number is $number")

    println("The result is ${number?.times(5)}")
}
