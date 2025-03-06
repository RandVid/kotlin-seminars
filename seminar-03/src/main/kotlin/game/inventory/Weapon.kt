package org.edu.jvm.languages.game.inventory

import org.edu.jvm.languages.game.character.Character
import org.edu.jvm.languages.game.items.Item

data class Weapon(override val name: String, var damageBoost: Int) : Item(name) {
    var isEquipped: Boolean = false
    override fun use(character: Character) {
        character.health += damageBoost
    }
}
