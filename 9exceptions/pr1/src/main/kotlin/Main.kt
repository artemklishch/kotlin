package org.example

import java.io.File
import java.io.FileWriter
import java.io.IOException

fun main() {
    readFile("example.txt")
//    writeFile("example.txt", "Hello, Kotlin!")
}

fun readFile(fileName: String) {
    try {
        val file = File(fileName)
        val content = file.readText()
        println("File content: $content")
    } catch (e: IOException) {
        println("Error reading file: ${e.message}")
    }
}

fun writeFile(fileName: String, content: String) {
    var fileWriter: FileWriter? = null
    try {
        fileWriter = FileWriter(fileName)
        fileWriter.write(content)
        println("File written successfully")
    } catch (e: IOException) {
        println("Error writing to file: ${e.message}")
    } finally {
        try {
            fileWriter?.close()
            println("Resource closed")
        } catch (e: IOException) {
            println("Error closing the file writer: ${e.message}")
        }
    }
}
