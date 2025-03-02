package org.edu.jvm.languages.game.inventory

import org.edu.jvm.languages.game.character.GameCharacter

data class Elixir(override val name: String, val restoreHealth: Int) : Item(name) {
    override fun use(character: GameCharacter) {
        character.health += restoreHealth
        println("$name consumed! Restores $restoreHealth health.")
    }
}
