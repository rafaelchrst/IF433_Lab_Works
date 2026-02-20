println("\n=== TEST WEAPON ===")

val sword = Weapon("Excalibur", 300)

println("Damage awal: ${sword.damage}")
println("Tier awal: ${sword.tier}")

sword.damage = -50

sword.damage = 9999

println("Damage setelah update: ${sword.damage}")
println("Tier sekarang: ${sword.tier}")