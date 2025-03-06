package org.edu.jvm.languages.game.inventory

import org.edu.jvm.languages.game.character.GameCharacter

abstract class Item(open val name: String) {
    abstract fun use(character: GameCharacter)
}
