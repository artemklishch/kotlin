package org.example.pr1

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr1Application

fun main() {
    printSelfInfo()
}

////public fun printSelfInfo() { // no need for 'public' modifier
////    println("I am function")
////}
//
////protected fun printSelfInfo() { // error - використовуємо тільки в класах та підкласах
////    println("I am function")
////}
//
////internal fun printSelfInfo() { // видимість в середині модулю
////    println("I am function")
////}
//
private fun printSelfInfo() { // видимість всередині цього файлу або всередині класу
    println("I am function")
}
