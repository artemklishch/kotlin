package org.example.pr1

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr1Application

fun main() {
//    val name1: String = null // compile error
    val name1: String? = null
    println(name1)

    println("\n")
    val a: Int? = null
//    val b: Int? = null
//    val res = a + b // compile error
    val res = a?.plus(10)
    println(res) // null

    val a1: Int? = 4
    println(a1?.plus(10)) // 14
    println(a1?.times(2)) // 8 (multiplying)
    println(a1?.times(2)?.plus(1)) // 9

    println("\n")
    val name2: String? = null
    println(name2)
    println(name2?.length) // null, ? - safe call operator
    val name3: String? = "Bob"
    println(name3?.length) // 3
}
