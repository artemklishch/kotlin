package org.example

fun main() {
    MyClass1.myStaticValue = 100
    MyClass1.printStaticValue() // Static value is 100
}

class MyClass1 {
    companion object {
        @JvmStatic
        var myStaticValue: Int = 42

        @JvmStatic
        fun printStaticValue() {
            println("Static value is $myStaticValue")
        }
    }
}