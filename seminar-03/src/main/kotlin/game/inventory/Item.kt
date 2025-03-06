package org.edu.jvm.languages.game.items

import org.edu.jvm.languages.game.character.Character

abstract class Item(open val name: String) {
    abstract fun use(character: Character)
}
