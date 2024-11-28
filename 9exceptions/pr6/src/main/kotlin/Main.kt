package org.example

import java.io.File

fun main() {
    // Ім'я файлу, у який ми хочемо записати дані
    val fileName = "output.txt"

    // Рядок, який ми хочемо записати
    val content = "Hello, mates!"

    // Створюємо об'єкт File з ім'ям файлу
    val file = File(fileName)

    // Записуємо рядок у файл
    file.writeText(content)

    println("Data has been written to the file.")

    // Створюємо об'єкт File з ім'ям файлу
    val fileName1 = "example.txt"
    val file1 = File(fileName1)

// Перевіряємо, чи файл існує
    if (file1.exists()) {
        println("File exists.")

        // Перевіряємо, що це звичайний файл, а не директорія
        if (file1.isFile) {
            println("This is a file.")

            // Читаємо весь вміст файлу як текст
            val content = file1.readText()
            println("Content of the file:")
            println(content)
        } else {
            println("This is not a regular file.")
        }
    } else {
        println("File does not exist.")
    }
}
