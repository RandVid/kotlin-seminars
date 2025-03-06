package org.edu.jvm.languages.game.inventory

import org.edu.jvm.languages.game.items.Item

class Inventory(private var items: MutableList<Item> = mutableListOf()) : Iterable<Item> {
    
    fun addItem(item: Item) {
        items.add(item)
    }
    fun removeItem(item: Item) {
        items.remove(item)
    }
    fun hasItems(): Boolean {
        return items.isNotEmpty()
    }
    fun getRandomItem() {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<Item> {
        return items.iterator()
    }

}