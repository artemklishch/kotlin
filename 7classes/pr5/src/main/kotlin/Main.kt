package org.example

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun main() {
//    object DefaultListener : MouseAdapter() { // error, don't use as local named object, inside function
//        override fun mouseClicked(e: MouseEvent) {}
//
//        override fun mouseEntered(e: MouseEvent) {}
//    }
    val ob = object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {}

        override fun mouseEntered(e: MouseEvent) {}
    }
}

object DefaultListener : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) {}

    override fun mouseEntered(e: MouseEvent) {}
}