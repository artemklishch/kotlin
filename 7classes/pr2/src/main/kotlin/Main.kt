package org.example

fun main() {
    println(helloWorld) // Hello World
    val c = C()
    c.printX() // x
//    c.getObject() // no access, when it is private
}

val helloWorld = object {
    val hello = "Hello"
    val world = "World"

    // object expressions extend Any, so 'override' is required on 'toString', if we want to use it
    override fun toString(): String = "$hello $world"
}

class C {
    private fun getObject() = object {
        val x: String = "x"
    }

    fun printX() {
        println(getObject().x)
    }
}

//fun printX() { // no access to the function "getObject"
//    println(getObject().x)
//}