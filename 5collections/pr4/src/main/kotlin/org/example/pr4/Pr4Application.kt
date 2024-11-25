package org.example.pr4

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr4Application

fun main() {
    val number = 1357
    val result = reverseDigits(number)
    println(result)

    val nums1 = intArrayOf(10, 2, 5, 3)
    println(checkIfExists(nums1))
}

fun reverseDigits(number: Int): List<Int> {
//    return number.toString().map { it.toString().toInt() }.reversed() // reversed - deprecated
    return number.toString().map { it.toString().toInt() }.toList().asReversed()
}

//fun checkIfExists(numbers: IntArray): Boolean {
//    val uniqNums = mutableSetOf<Int>()
//    for (num in numbers) {
////        if (uniqNums.contains(num * 2) || (num % 2 == 0) && uniqNums.contains(num / 2)) {
////            return true
////        }
//        if ((num * 2) in uniqNums || (num % 2 == 0) && (num / 2) in uniqNums) {
//            return true
//        }
//        uniqNums.add(num)
//    }
//    return false
//}

fun checkIfExists(numbers: IntArray): Boolean {
    val uniqNums = mutableSetOf<Int>()
    numbers.forEach {
        if (it * 2 in uniqNums || it % 2 == 0 && it / 2 in uniqNums)
            return true // non local return; повертається з лямбди. та є поверненням з усього батьківського методу checkIfExists
        uniqNums.add(it)
    }
    return false
}
