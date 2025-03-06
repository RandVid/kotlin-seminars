package org.edu.jvm.languages.game.inventory

import org.edu.jvm.languages.game.character.Character
import org.edu.jvm.languages.game.items.Item

data class Armor(override val name: String, var healthBoost: Int) : Item(name) {
    override fun use(character: Character) {
        character.health += healthBoost
    }
}
