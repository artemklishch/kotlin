package org.example

import kotlin.random.Random

fun main() {
    val numbers by lazy { generateList() }
    println("Should the list be generated? yes/no")
    val answer = readLine() ?: ""
    if (answer == "yes") {
        println(numbers)
    }
}

fun generateList(): List<Int> {
    val integers = arrayListOf<Int>()
    for (i in 1..1000) {
        integers.add(Random.nextInt(10000))
    }
    println("DONE!")
    return integers
}