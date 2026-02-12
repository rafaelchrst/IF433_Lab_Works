package oop_00000135764_RafaelChristhiano.week01

fun main() {
    // Variable definition
    val radius = 7.0
    val pi = 3.14
    // Calculation
    var area: Double = pi * radius * radius
    // Output Concatenation
    println("Radius: $radius, Area: $area")
    // Logic check
    println("check size: ${checkSize(area)}")
}
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"