package oop_00000135764_RafaelChristhiano.week03

fun main() {

    println("=== TEST EMPLOYEE ===")

    val emp = Employee("Rafael", 5_000_000.0)
    println("Nama: ${emp.name}")
    println("Salary: ${emp.salary}")

    emp.salary = -1000.0
    println("Salary setelah update: ${emp.salary}")



    println("\n=== TEST WEAPON ===")

    val sword = Weapon("Excalibur", 300)

    println("Damage awal: ${sword.damage}")
    println("Tier awal: ${sword.tier}")

    sword.damage = -50
    sword.damage = 9999

    println("Damage setelah update: ${sword.damage}")
    println("Tier sekarang: ${sword.tier}")



    println("\n=== TEST PLAYER ===")

    val player = Player("Rafael")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}