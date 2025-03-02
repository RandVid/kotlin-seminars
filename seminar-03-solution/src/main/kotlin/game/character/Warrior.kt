package org.edu.jvm.languages.game.character

import org.edu.jvm.languages.game.inventory.Inventory

class Warrior(name: String) : GameCharacter(name, 100, 10, Inventory()) {
    override fun defend(incomingDamage: Int) {
        super.defend((incomingDamage * 0.8).toInt())
    }
}
