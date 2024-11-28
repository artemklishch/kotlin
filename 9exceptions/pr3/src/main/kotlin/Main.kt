package org.example

import java.io.IOException
import java.io.File

// Клас, який може викидати IOException
class FileReader {

    @Throws(IOException::class) // Анотація для інформування Java-коду про можливий виняток
    fun readFile(path: String): String {
        val file = File(path)

        if (!file.exists()) {
            throw IOException("Файл не знайдено: $path")
        }

        return file.readText() // Читання тексту з файлу, яке може викинути IOException
    }
}

// У Kotlin немає перевірених винятків, але ми можемо їх обробити через try catch
fun main() {
    val fileReader = FileReader()

    try {
        val content = fileReader.readFile("file.txt")
        println("Зміст файлу: $content")
    } catch (e: IOException) {
        println("Сталася помилка: ${e.message}")
    }
}
