package org.example.pr2

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr2Application

// data types
fun main() {
    val byteValue: Byte = 127
    val shortValue: Short = 10
    val intValue: Int = 44 // дефолтний тип для числа
    val longValue: Long = 42L
    val doubleValue: Double = 42.0
    val floatValue: Float = 43.0f
    val charValue: Char = 'a'
    val stringValue: String = "Hello World"
    val booleanValue: Boolean = false

    val list1 = listOf<Int>(22, 33, 55, 66, 77, 88) // якщо не вказувати <Int>, то можна передавати різні типи
    println(list1)
    // наприклад listOf(22, 33, 55, 66, 77, 88, "some string)
    val list2 = listOf(22, 33, 55, 66, 77, 88, "some string")
    println(list2)

    val number1: Int = -100 // -2^31 ... 2^31-1... first left bit
    println(number1)

    // беззнакові типи UInt, ULong...
    var positive: UInt = 100u // -100u - помилка, 0...2^32-1
    positive += 15u
    println(positive) // 115

    val name = "Kotlin"
    val greeting = "Hello, $name"
    println(greeting)

//    val name2: Any = // Any - будь-який тип, як Object в Java
    var value1: Any = "Hello"
    value1 = 32
    value1 = false
    println(value1) // false

    // instance of
    if (value1 is String) {
        println("This is string")
    } else {
        println("This is not string")
    }

    // convert data type
    val value2 = "123"
    val number2: Int = value2.toInt()
    println(number2 is Int) // true

    println("\n")
    val value3 = "1"
    val value4 = value3.toInt()
    val value5 = value4.toDouble()
    println(value3.javaClass) // class java.lang.String
    println(value4::class.java) // almost the same as value4.javaClass; int
    println(value5.javaClass) // double
}
