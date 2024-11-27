package org.example

fun main() {
    println(" Hello World! ".trimMargin()) // without spaces in the ends

    val numbers = setOf(1, 2, 3, 4, 5)
    val allEven = numbers.allMatch { it % 2 == 0 }
    println(allEven)  // Виведе `false`, оскільки не всі числа парні

    val allPositive = numbers.allMatch { it > 0 }
    println(allPositive)  // Виведе `true`, оскільки всі числа позитивні

    println("Kotlin".middleCharacter) // l

}

fun String.trimMargin(): String = this.trim { it <= ' ' }

fun <T> Set<T>.allMatch(predicate: (T) -> Boolean): Boolean {
    for (element in this) {
        if (!predicate(element)) {
            return false
        }
    }
    return true
}


val String.middleCharacter: Char
    get() = this[length / 2]