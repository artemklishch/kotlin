package org.example.pr7

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr7Application

fun main() {
    for (i in 1..5) {
        println(i) // враховується включно й 1, і 5
    }
    println("\n")
    for (i in 1..10 step 2) { // крок 2; 1,3,5,7,9
        println(i)
    }
    println("\n")
    for (i in 10 downTo 1 step 2) { // в зворотному порядку, крок 2; 10, 8 6, 4, 2
        println(i)
    }
    println("\n")
    val fruits = listOf("Apple", "Orange", "Pineapple") // forEach - в колекціях
//    fruits.forEach(::println)
    fruits.forEach { f -> println(f) }
    fruits.forEachIndexed { index, fruit -> println("$index: $fruit") } // 0: Apple...
    println("\n")
    for (i in 1..5) {
        println("hello mates")
    }
    repeat(5) { println("hello mates") } // the same as with the loop; виводить строку 5 разів, як у вище наведеному циклі

    println("\n")
    val word = "Hello"
    for (char in word) {
        println(char)
    }
}
