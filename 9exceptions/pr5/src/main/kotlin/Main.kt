package org.example

import java.io.File
import java.io.IOException

fun readFileSafely(fileName: String) {
    val result = runCatching {
        val file = File(fileName)
        file.readText()
    }

    result.onSuccess {
        // Обробка результату на успіх
        println("File content: $it")
    }.onFailure {
        // Обробка результату на помилку
        println("Error reading file: ${it.message}")
    }
}

fun divide(a: Int, b: Int): Result<Int> {
    return if (b == 0) {
        Result.failure(ArithmeticException("Ділення на нуль"))
    } else {
        Result.success(a / b)
    }
}

fun main() {
    readFileSafely("example.txt")


    val result = divide(10, 0)

    if (result.isSuccess) {
        // Отримати значення, якщо успішно
        val value = result.getOrThrow()
        println("Результат: $value")
    } else {
        // Отримати виняток, якщо сталась помилка
        val exception = result.exceptionOrNull()
        println("Помилка: ${exception?.message}")
    }
}
