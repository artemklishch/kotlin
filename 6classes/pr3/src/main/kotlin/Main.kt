//package org.example
//
//fun main() {
//    val bob = Person("Bob", 19)
//    val bob2 = Person("Bob", 19)
//    println(bob)
//    println(bob2.equals(bob)) // false
//}
//
//class Person(val name: String, val age: Int) {
//    override fun toString(): String {
//        return "Person(name='$name', age=$age)"
//    }
//}

package org.example

fun main() {
    val bob = Person("Bob", 19)
    val bob2 = Person("Bob", 19)
    println(bob2.equals(bob)) // true
    println(bob2 == bob) // true
    println(bob2 === bob) // false
    // equals - здійснює порівняння структурної рівності посилань - потрібно перевизначати методі equals/hashCode
    // == - здійснює просте порівняння як при методі equals - потрібно перевизначати методі equals/hashCode
    // === - здійснює порівняння посилань
}

class Person(val name: String, val age: Int) { // в дужках - первинний конструктор
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (age != other.age) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = age
        result = 31 * result + name.hashCode()
        return result
    }
}