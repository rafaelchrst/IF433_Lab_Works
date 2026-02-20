println("\n=== MINI RPG BATTLE ===")

print("Masukkan Nama Hero: ")
val heroName = scanner.nextLine()

print("Masukkan Base Damage Hero: ")
val damage = scanner.nextLine().toInt()

val hero = Hero(heroName, damage)
var enemyHp = 100

while (hero.isAlive() && enemyHp > 0) {

    println("\n1. Serang")
    println("2. Kabur")
    print("Pilihan: ")

    val choice = scanner.nextLine().toInt()

    if (choice == 1) {
        hero.attack("Musuh")
        enemyHp -= hero.baseDamage

        if (enemyHp < 0) enemyHp = 0

        println("Sisa HP Musuh: $enemyHp")

        if (enemyHp > 0) {
            val enemyDamage = (10..20).random()
            println("Musuh menyerang balik sebesar $enemyDamage!")
            hero.takeDamage(enemyDamage)
            println("Sisa HP Hero: ${hero.hp}")
        }

    } else if (choice == 2) {
        println("Hero kabur dari pertarungan!")
        break
    } else {
        println("Pilihan tidak valid.")
    }
}

println("\n=== HASIL PERTARUNGAN ===")

if (hero.isAlive() && enemyHp == 0) {
    println("${hero.name} MENANG!")
} else if (!hero.isAlive()) {
    println("Musuh MENANG!")
} else {
    println("Pertarungan berakhir tanpa pemenang.")
}