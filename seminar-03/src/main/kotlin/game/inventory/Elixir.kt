package org.edu.jvm.languages.game.inventory

import org.edu.jvm.languages.game.character.Character
import org.edu.jvm.languages.game.items.Item

data class Elixir(override val name: String, val effectPower: Int, val type: String) : Item(name) {
    override fun use(character: Character) {
        when(type) {
            "damage"->character.damage = effectPower
            "heal"->character.health = effectPower
            else -> throw NotImplementedError()
        }
    }
}
