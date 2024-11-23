package org.example.pr1

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr1Application

fun main() {
    println(getArea(10, 3))
    print("Hello World")
    println(getArea1(20, 2)) // 40
    println(getArea1(20.0, 2.0)) // 40.0
}

fun getArea(a: Int, b: Int): Int {
    return a * b
}

//fun print(text: String): Unit // коли функція нічого не повертає - використовуємо тип Unit, але немає потреби додавати це явно
fun print(text: String) {
    println(text)
}

//fun getArea1(a: Int, b: Int): Int = a * b
fun getArea1(a: Int, b: Int) = a * b
fun getArea1(a: Double, b: Double) = a * b // перевантаження функції