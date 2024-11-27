package org.example

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    val p3 = p1 + p2
    println("${p3.x}, ${p3.y}")
}

class Point(val x: Int, val y: Int) {
    //    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}