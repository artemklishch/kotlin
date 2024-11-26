package org.example

fun main() {
//    val userId = 10
//    val productId = 25
//    processOrder(productId, userId)
//    processOrder(userId, productId)
    val userId = 10
    val productId = 25
    processOrder(ProductId(productId), UserId(userId))
//    processOrder(UserId(userId), ProductId(productId)) // in this case - the compile error
}

//fun processOrder(productId: Int, userId: Int) {
//    println("Order processing started... Product id = $productId, user id = $userId")
//}

fun processOrder(productId: ProductId, userId: UserId) {
    println("Order processing started... Product id = ${productId.id}, user id = ${userId.id}")
}

@JvmInline // ця анотація означає, що клас потрібно вбудовувати, без неї такий клас не працює
value class ProductId(val id: Int)

@JvmInline
value class UserId(val id: Int)

@JvmInline
value class Email(val address: String)

interface Identifiable {
    val id: String
}

@JvmInline
value class OrderId(override val id: String) : Identifiable