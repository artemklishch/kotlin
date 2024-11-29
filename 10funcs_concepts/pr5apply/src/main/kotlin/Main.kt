package org.example

fun main() {
    val car = MyCar().apply {
        speed = 80
        color = "red"
        startCar()
    }
    println(car)

    println("\n")

    Lock().unlock(Key().apply {
        secretCode = "some_code"
        "123"
    })
}

class MyCar {
    var speed = 10
    var color = "blue"
    fun startCar() {
        println("The car starting, speed is $speed, color is $color")
    }

    override fun toString(): String {
        return "MyCar(speed=$speed, color='$color')"
    }
}

class Lock {
    fun unlock(key: Key) {
        println("Unlocked with key $key")
    }
}

class Key {
    var secretCode = ""
    fun carve() {
        println("Carving the key with code $secretCode")
    }

    override fun toString(): String {
        return "Key(secretCode='$secretCode')"
    }
}
