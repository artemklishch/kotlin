package org.example

fun main() {
    println("Enter your name...")
    val name: String? = readLine()
//    name?.let {
////        printName(it)
//            str ->
//        printName(str)
//    }
    name?.let(::printName)
}

fun printName(name: String) {
    println("Your name is $name")
}
