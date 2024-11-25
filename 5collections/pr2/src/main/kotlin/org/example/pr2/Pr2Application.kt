package org.example.pr2

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr2Application

fun main() {
    val numbers = arrayOf(3, 6, -2, -5, 7, 3)
    println(findMaxProduct(numbers))

    val numbers2 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    rotate(numbers2, 3)
    println(numbers2.contentToString())
}

fun findMaxProduct(array: Array<Int>): Int {
    var maxProduct = array[0] * array[1]
    for (i in 1 until array.size - 1) {
        val updatedValue = array[i] * array[i + 1]
        if (updatedValue > maxProduct) {
            maxProduct = updatedValue
        }
    }
    return maxProduct
}

fun rotate(numbers: IntArray, step: Int) {
    val length = numbers.size
    val k = step % length
//    reverse(numbers, 0, length - 1)
//    reverse(numbers, 0, k - 1)
//    reverse(numbers, k, length - 1)

    numbers.reverse()
    numbers.reverse(0, k)
    numbers.reverse(k, length)
}

// custom reverse function
//fun reverse(numbers: IntArray, start: Int, end: Int) {
//    var i = start
//    var j = end
//    while (i < j) {
//        val temp = numbers[i]
//        numbers[i] = numbers[j]
//        numbers[j] = temp
//        i++
//        j--
//    }
//}
