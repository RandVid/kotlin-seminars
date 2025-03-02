package org.edu.jvm.languages.game.inventory

class Inventory : Iterable<Item> {
    private val items = mutableListOf<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun removeItem(item: Item) {
        items.remove(item)
    }

    fun hasItems(): Boolean {
        return items.isNotEmpty()
    }

    fun getRandomItem(): Item? {
        return if (items.isNotEmpty()) items.random() else null
    }

    override fun iterator(): Iterator<Item> {
        return items.iterator()
    }
}
