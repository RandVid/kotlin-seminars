package org.edu.jvm.languages.game.character

import org.edu.jvm.languages.game.inventory.Inventory

class Warrior(name: String, inventory: Inventory) : Character(name, inventory)  {
    override var health: Int = 100
    override var damage: Int = 10

    override fun defend(incomingDamage: Int) {
        super.defend((incomingDamage * 4)/5)
    }
}