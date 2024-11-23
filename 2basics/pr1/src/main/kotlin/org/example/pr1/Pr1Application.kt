package org.example.pr1

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr1Application

fun main() {
//    val name = "Bob"
//    val age = 23
//    val age: Int = 23
    // name = 24 // - error

    // змінні, оголошені з ключовим словом val є константами
    // змінні, значення ких можна перепризначати - оголошуються з ключовим словом var

    var name: String = "Bob" // позначення типу з ключовим словом String - з технічної сторони не обов'язкове, оскільки
    // призначення строки автоматично визначає, що ця змінна буде містити строку
    name = "Tom"
    println(name)

}
