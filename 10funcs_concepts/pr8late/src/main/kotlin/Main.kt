package org.example

fun main() {
    lateinit var networkService: String
    networkService = initNeteworkService()
    println(networkService) // перед зверненням до змінної потрібно обов'язково присвоїти значення

//    lateinit var age: Int // 'lateinit' modifier is not allowed on local variables of primitive types.
//    age = 25
//    println(age)
}

fun initNeteworkService(): String {
    return "Service"
}

class UserService {
    lateinit var userRepository: UserRepository
}

class UserRepository {
    fun findUserById(id: Long): User {
        return User(id, "Bob")
    }
}

class User(val id: Long, val name: String) {}