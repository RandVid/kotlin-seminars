package org.edu.jvm.languages.game.character

import org.edu.jvm.languages.game.inventory.Inventory

abstract class GameCharacter(
    val name: String,
    var health: Int,
    private val damage: Int,
    val inventory: Inventory
) {

    fun isAlive(): Boolean {
        return health > 0
    }

    open fun attack(target: GameCharacter) {
        println("$name attacks ${target.name} for $damage damage!")
        target.defend(damage)
    }

    open fun defend(incomingDamage: Int) {
        health -= incomingDamage
        println("$name takes $incomingDamage damage. Remaining health: $health")
    }
}
