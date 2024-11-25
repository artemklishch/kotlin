package org.example.pr3

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Pr3Application

fun main() {
//    val immutableList = listOf(1, 2, 3)
//    val immutableSet = setOf(1, 2, 3)
//    val immutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val immutableList: List<Int> = listOf(1, 2, 3)
    val immutableSet: Set<Int> = setOf(1, 2, 3)
    val immutableMap: Map<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

    println(immutableList)
    println(immutableSet)
    println(immutableMap)
//    [1, 2, 3]
//    [1, 2, 3]
//    {1=one, 2=two, 3=three}

    println("\n")

//    val mutableList = mutableListOf(1, 2, 3)
//    val mutableSet = mutableSetOf(1, 2, 3)
//    val mutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    val mutableSet: MutableSet<Int> = mutableSetOf(1, 2, 3)
    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableList.add(1)
    mutableSet.add(23)
    mutableMap.put(4, "four")

    println(mutableList)
    println(mutableSet)
    println(mutableMap)
//    [1, 2, 3, 1]
//    [1, 2, 3, 23]
//    {1=one, 2=two, 3=three, 4=four}

    println("\n")

    val readOnlyView: List<Int> = mutableList // readOnlyView тепер не можна редагувати, навіть попри те,
    // що mutableList - змінювана колекція

    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val listFromArray = array.toList()
    val arrayFromList: Array<Int> = list.toTypedArray()

    var list2 = sequenceOf(1, 2, 3) // як stream API в Java, де є можливість чейнінгу
        .map { it * 2 } // { e -> e * 2 }
        .filter { it > 2 }
        .toList()
    println(list2) // [4, 6]
}

