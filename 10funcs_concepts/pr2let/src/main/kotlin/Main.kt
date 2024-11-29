package org.example

fun main() {
//    println("Input number")
//    val input: String? = readLine()
//    input?.let {
//        val number = it.toInt()
//        println("The double of your number is ${number * 2}")
//    }

    val animals = arrayListOf<String?>()
    for (i in 1..3) {
        println("Input an animal")
        val input = readLine()
        input?.let {
            if (it == "") animals.add(null) else animals.add(it)
        }
    }
    animals.forEach() {
        println("Feeding the animal $it")
    }

    animals.forEach() {
        it?.let {
            println("Feeding the animal $it") // не буде відпрацьовувати (виводити значення), якщо it - null
        }
    }
}