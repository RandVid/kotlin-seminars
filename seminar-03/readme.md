# Implement Fraction class
In this seminar, you will implement a simple rgp game in Kotlin, where multiple charachters can battle with each other. 

Seminar outcomes:
* Class hierarchy and inheritance
* Interfaces and polymorphism
* Iterable implementation


### Task 1
**Create a structured hierarchy for characters in a battle system.**
In this game we have different types of characherts with their own abilities. Lets implement basic hierarchy of them.

**Class Diagram**:

1) `Character`
   
   Properties: `name: String`, `health: Int`, `level: Int`

   Methods: `attack(target: Character)`, `defend()`

2) `Warrior : Character`
    Specialized attack behavior

3) `Mage : Character`
    Can cast spells

**Bonus task**:
1) Extend your class with new charachers as you wish.

### Task 2
**Implement Combat Mechanics**. 
In this game, each charachers can fight with other, so we have to provide necessary behaviour such as attack and defend.

Define an abstract or interface-based combat system:

`Combatant` interface with the following methods:
* performAttack() method, ensuring each character implements it.
* fun performDefend()
* fun isAlive(): Boolean


### Task 3
**Introduce an inventory system for item management.**

In any rgp game you have some inventory with you, where you store your items, such as weapons, elixirs and so on. Lets provide such ability for our charachers.

1) Define class `Item` with the following properties:
   * id: Int
   * name: String
   * val effect: String)

2) Create an `Inventory` class that:
   * Holds a collection of Item
   * Implements Iterable<Item> to allow iteration over items



