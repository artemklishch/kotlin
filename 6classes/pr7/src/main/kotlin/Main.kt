package org.example

fun main() {
    val car: Car = Car() // тип за замовчуванням
//    val car: Vehicle = Car() // якщо ми параметризуємо за допомогою Vehicle, то екземпляр не має доступу до функції
    // stop - оскільки інтерфейс Vehicle не містить цієї функції
    car.drive()
    car.stop()
}

interface Vehicle {
    fun drive() { // default realization
        println("Vehicle is driving")
    }
}

class Car : Vehicle {
    override fun drive() {
        println("Car is driving.")
    }

    fun stop() {
        println("Car is stop.")
    }
}