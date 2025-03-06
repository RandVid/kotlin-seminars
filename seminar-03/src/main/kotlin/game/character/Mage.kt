package org.edu.jvm.languages.game.character

import org.edu.jvm.languages.game.inventory.Inventory

class Mage(name: String, inventory: Inventory) : Character(name, inventory) {
    override var health: Int = 70
    override var damage: Int = 15
}