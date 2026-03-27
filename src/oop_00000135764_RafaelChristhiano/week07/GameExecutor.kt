package oop_00000135764_RafaelChristhiano.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Awas! Ada ${event.monsterName} muncul!")
        }
        is BattleState.LootDropped -> {
            val (name, _, rarity) = event.item
            println("Hore! Dapat item: $name [Rarity: $rarity]")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        is BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Silakan beristirahat.")
        }
    }
}