package org.example

fun main() {
    println(getUserInfo())
    println(getUserExtendedInfo())
}

fun getUserInfo(): Pair<String, Int> {
    return Pair("Bob", 22)
}

fun getUserExtendedInfo(): Triple<String, Int, String> {
    return Triple("Bob", 22, "test@gmail.com")
}
