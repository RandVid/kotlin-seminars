package org.edu.jvm.languages.game.items

abstract class Item(open val name: String) {
    abstract fun use(character: Character)
}
