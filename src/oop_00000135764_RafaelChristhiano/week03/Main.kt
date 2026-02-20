package oop_00000135764_RafaelChristhiano.week03

fun main() {

    val e = Employee("Rafael", 1000)

    println("Nama: ${e.name}")
    println("Salary awal: ${e.salary}")

    e.salary = -500

    e.salary = 5000
    println("Salary setelah update: ${e.salary}")

    e.updateRating(4)

    println("Bonus: ${e.bonus}")
}