package oop_00000135764_RafaelChristhiano.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == DataUser("Alice", 22)}")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is Success -> "Tampilkan: ${response.data}"
        is Error -> "Munculkan alert: ${response.message}"
        is Loading -> "Tampilkan Spinner"

        println("\n=== SIMULASI TUGAS RPG ===")
                GameManager.startGame()
                GameManager.startGame()
    println("Drop Chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}")
    }
    println(uiMessage)
}