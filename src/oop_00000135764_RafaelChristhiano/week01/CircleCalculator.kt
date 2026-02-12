package oop_00000135764_RafaelChristhiano.week01

fun main() {
    val radius = 7.0
    val pi = 3.14
    var area: Double = pi * radius * radius
    println("Radius: $radius, Area: $area")
    println("check size: ${checkSize(area)}")
}
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"