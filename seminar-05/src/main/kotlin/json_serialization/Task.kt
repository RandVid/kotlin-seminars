package json_serialization

import kotlin.reflect.full.memberProperties

class Creature(
    val name: String,
    val attack: Int,
    val defence: Int,
    val traits: List<String>,
    val cost: Map<Element, Int>
)

enum class Element {
    FOREST, ANY
}

enum class Trait {
    FLYING
}

fun Any.toJson(): String {
    return objectToJson(this)
}

private fun objectToJson(any: Any): String {
    TODO("Logic for serializing objects")
}

private fun valueToJson(value: Any?): String {
    TODO("Logic for serializing values")
}

fun main() {
    val creature = Creature(
        name = "Cockatrice",
        attack = 2,
        defence = 4,
        traits = listOf("FLYING"),
        cost = mapOf(
            Element.ANY to 3,
            Element.FOREST to 2
        )
    )

    println(creature.toJson())
}
