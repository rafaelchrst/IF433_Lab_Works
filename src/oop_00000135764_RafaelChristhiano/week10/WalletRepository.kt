package oop_00000135764_RafaelChristhiano.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun find(predicate: (T) -> Boolean): T? {
        return items.find(predicate)
    }
}