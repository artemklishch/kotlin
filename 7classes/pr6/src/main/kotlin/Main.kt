package org.example

fun main() {
    MyClass.callMe() // Hello World!
    println(MyClass.message) // Message from MyClass
    val inst: MyClass2 = MyClass2.create()
    println(inst.value) // awesome class
}

class MyClass {
    companion object {
        const val message = "Message from MyClass"
        fun callMe() = println("Hello World!")
    }
}

//class MyClass2(val value: String) {
//    companion object Factory {
//        fun create(): MyClass2 = MyClass2("awesome class")
//    }
//}

interface Factory<T> {
    fun create(): T
}

class MyClass2(val value: String) {
    companion object : Factory<MyClass2> {
        override fun create(): MyClass2 = MyClass2("awesome class")
    }
}