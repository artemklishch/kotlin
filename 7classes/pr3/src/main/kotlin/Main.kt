package org.example

import java.awt.Component
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun main() {
    val c = C()
}

class C {
    val message = "Hello World"
    private fun getObject() = object {
        val x: String = "x12345"

        fun printMessage() {
            println(message)
        }
    }

    fun printX() {
        println(getObject().x)
    }
}

fun countClicks(window: Component) {
    var clickCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }
    })
}
