# Implement Simple RPG Game.
In this seminar, you will implement a simple rgp game in Kotlin, where multiple charachters can battle with each other. 

Seminar outcomes:
* Class hierarchy and inheritance
* Interfaces and polymorphism
* Iterable implementation

### Overview
Each RPG Game consist of multiple charachers with their own unique features. In addition, they have their own inventory with items, such as armor, weapon, elixirs and so on, that affects on the abilities. We will build both things and then simulate the battle between these charachers. 

### Task 1
**Create a structured hierarchy for characters in a battle system.**
In this game we have different types of characherts with their own abilities. Lets implement basic hierarchy of them.

#### Task 1.1

1) Create a base class named Character that will be the foundation for different types of fighters in the RPG game.
**Requirements:**

Store the following properties:`
* name: String
* health: Int
* damage: Int
* inventory: Inventory

`Implement methods`:
* isAlive(): Returns true if health is greater than zero.
* attack(target: Character): Deals damage to another character.
* defend(incomingDamage: Int): Defines how much damage a character takes.

#### Task 1.2
Create two subclasses of Character that represent different fighter types.

**Warrior:**
* Starts with 100 HP and 10 DMG.
* Takes 20% less damage when defending.

**Mage:**
* Starts with 70 HP and 15 DMG.
* Takes full damage when defending.

Each class should override:
* attack(target: Character): Prints an attack message.
* defend(incomingDamage: Int): Modifies damage taken.

**Bonus task**:
1) What if we dont want all charachers have fighing abilities? And we want to introduce new class `citizen`? It is character, but without fighing behaviour. Call the TA, discuss it and then implement :)

### Task 2
Implement the Item System

Implement abstract class `Item` with the following Item Types:

**Weapon**: Increases damage when equipped.

**Armor**: Increases health when equipped.

**Elixir**: Restores health or increases damage.



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

### Task 4
Implement the Inventory System

Create an `Inventory` class that allows characters to store items.
Inventory Features:
* implements Iterable interface
* addItem(item: Item): Adds an item to the inventory.
* removeItem(item: Item): Removes an item from the inventory.
* hasItems(): Returns true if there are items.
* getRandomItem(): Returns a random item from the inventory.

### Bonus Tasks

* Improve the `Inventory` class by organizing items based on their type. All elixirs should be stored in one container, all weapons in another, and so on.
* There is a logical error in the `Battle` class regarding how new equipment is used. Try to identify and fix it. Discuss your findings with the TA.
* Modify the Battle class (you can name it `BattleRoyal`) so that it allows an arbitrary number of characters to fight against each other until only one remains.



