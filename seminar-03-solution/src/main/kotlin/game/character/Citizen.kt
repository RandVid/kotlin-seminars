package org.edu.jvm.languages.game.character

import org.edu.jvm.languages.game.inventory.Inventory

class Citizen(name: String) : GameCharacter(name, 50, 0, Inventory()) {
    override fun attack(target: GameCharacter) {
        println("$name is a peaceful citizen and does not attack.")
    }
}
