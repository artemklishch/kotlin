package org.example

fun main() {
    val u1 = User("Alex", 30)
    val u2 = User("Alex", 30)
    println(u1) // User("Alex", 30)
    println(u1 == u2) // true
    println(u1.hashCode() == u2.hashCode()) // true
    val u3 = u1.copy()
    println(u3) // User("Alex", 30)
    println(u2 == u3) // true
    println(u3.hashCode() == u2.hashCode()) // true
    val u4 = u1.copy(age = 35)
    println(u4) // User("Alex", 35)
}

//data class User(val name: String, val age: Int)
data class User(var name: String, var age: Int) // в цьому випадку через var
// значення можна оновлювати через крапкову нотацію - u4.name = "Bob"
