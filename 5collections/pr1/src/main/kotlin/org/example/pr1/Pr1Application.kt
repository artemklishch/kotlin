package org.example.pr1

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr1Application

fun main() {
    val numbers: Array<Int> = Array(10) { 0 } // {0} - lambda,
// в даному випадку це масив на 10 елементыв, по дефолту такий масив містить нулі
    println(numbers.contentToString()) //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

    numbers[0] = 50
    numbers.set(1, 25)
    println(numbers.contentToString()) // [50, 25, 0, 0, 0, 0, 0, 0, 0, 0]
    println(numbers[0]) // 50
    println(numbers.get(1)) // 25

    println("\n")

    val numbers2: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//    numbers2.forEach { println(it) }
    numbers2.forEach { e -> println(e) } // the same as previous
    val filteredNums = numbers2.filter { e -> e > 2 } // тут ми отримуємо не масив,
    // а список і немає потреби для виведення викликати метод contentToString()
    println(filteredNums) // [3, 4, 5]
    val mappedList = numbers2.map { e -> e * e }
    println(mappedList) // [1, 4, 9, 16, 25], список

    val part = numbers2.slice(1..3)
    println(part) // [2, 3, 4], list

    println(arrayOfNulls<Int?>(5).contentToString()) // [null, null, null, null, null]
}
