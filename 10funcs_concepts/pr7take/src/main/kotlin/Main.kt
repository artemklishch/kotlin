package org.example

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 } // if even number - the number - otherwise - null
    println(evenOrNull)
    val oddOrNull = number.takeUnless { it % 2 == 0 } // vice versa
    println(oddOrNull)

    println("\n")

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers)
    val evenNumbers = arrayListOf<Int>()
    for (number in numbers) {
        number.takeIf { it % 2 == 0 }?.let { evenNumbers.add(it) }
    }
    println(evenNumbers)

    println("\n")

    val clients = listOf("Alice", "Bob", "Charlie", "Carol", "Alex")
    val newClients = arrayListOf<String>()
    for (client in clients) {
        client.takeUnless { it[0] == 'A' }
            ?.let { newClients.add(it) }
    }
    println(newClients)
}