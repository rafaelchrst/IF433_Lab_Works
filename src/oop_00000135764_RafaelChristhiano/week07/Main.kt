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

    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println(uiMessage)

    println("\n=== SIMULASI TUGAS RPG ===")

    GameManager.startGame()
    GameManager.startGame()

    println("Drop Chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}")

    val upgradedItem = starterWeapon.item.copy(
        name = "Pedang Kayu Upgrade",
        damage = 25
    )

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}