package oop_00000135764_RafaelChristhiano.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70), UNCOMMON(40), RARE(20), EPIC(10), LEGENDARY(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)