package org.edu.jvm.languages.game.character

import org.edu.jvm.languages.game.inventory.Inventory

abstract class Character (var name:String, var inventory: Inventory) {
    abstract var health: Int
    abstract var damage: Int

    open fun isAlive(): Boolean {
        return health > 0
    }
    open fun attack(target: Character) {
        target.defend(damage)
    }
    open fun defend(incomingDamage: Int) {
        health -= incomingDamage
    }
}