package org.example.pr3

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr3Application

fun main() {
    val name1: String? = null
    val value1: String = name1
        ?: "Bob" // виводиться значення name1, якщо воно не null, або дефолтне значення, яке вказане після оператору
    println(value1)

    val ternaryValue = if (name1 != null && name1.length > 1) name1 else "Alice"
    println(ternaryValue)

    println("\n")
    // !! not nullable operator
    // використовувати тільки якщо ми впевнені, що значення напевно не є null -
    // в іншому випадку, якщо трапиться значення null - буде помилка
    val name2: String? = "Bbby"
    println(name2!!.length) // ми як розробники - гарантуємо, що значення name2 не null
}
