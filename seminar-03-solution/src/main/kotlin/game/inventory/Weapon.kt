package org.edu.jvm.languages.game.inventory

import org.edu.jvm.languages.game.character.GameCharacter

data class Weapon(override val name: String, val bonusDamage: Int) : Item(name) {
    override fun use(character: GameCharacter) {
        println("$name equipped! Increases damage by $bonusDamage.")
    }
}
