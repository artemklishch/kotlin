package org.example

import java.io.*

fun readFile1(fileName: String) {
    BufferedReader(FileReader(fileName)).use { br ->
        var line: String?
        while (br.readLine().also { line = it } != null) {
            println(line)
        }
    }
}

fun readFile(fileName: String) {
    try {
        BufferedReader(FileReader(fileName)).use { br ->
            var line: String?
            while (br.readLine().also { line = it } != null) {
                println(line)
            }
        }
    } catch (e: IOException) {
        println("Error reading file: ${e.message}")
    }
}

fun main() {
    val file: FileWriter = FileWriter("example.txt")
    file.write("Hello, world!\n")
    file.write("Hello, world again!")
    file.close()
    readFile("example.txt")
}