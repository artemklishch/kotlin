package org.example

// object expressiobt
fun main() {
    setClickListener(object : ClickListener {
        override fun onClick() {
            println("Clicked!")
        }
    })
    setClickListener { println("Clicked lambda!") }
}

//@JvmFunctionalInterface
fun interface ClickListener {
    fun onClick()
}

fun setClickListener(listener: ClickListener) {
    // some logic
    listener.onClick()
}