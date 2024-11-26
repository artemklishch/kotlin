package org.example

fun main() {
    val bob = Person("Bob", 19)
    val bob2 = Person("Bob", 19)
    println(bob)

    val box1 = Box("gift")
    val box2 = Box("gift")
    println(box1 == box2) // true
}

class Person(val name: String) {
    constructor(name: String, age: Int) : this(name) { // вторинний конструктор
        println("Age: $age")
    }

    override fun toString(): String {
        return "Person(name='$name')" // немає поля age - тому і не можна його отримати в цьому методі
    }

    init {
        println("New person created: $name") // відпрацьовує раніше, ніж вторинний конструктор
    }
}

class Box(val contents: String) {
    override fun equals(other: Any?): Boolean {
        if (other is Box) return contents == other.contents
        return false
    }
}