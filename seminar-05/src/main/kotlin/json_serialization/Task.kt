package json_serialization

import kotlin.reflect.full.memberProperties

// @Target(AnnotationTarget.PROPERTY)
// annotation class JsonName(val name: String)

// @Target(AnnotationTarget.PROPERTY)
// annotation class JsonIgnore

class Creature(
//    @JsonIgnore val name: String,
//    @JsonName("att") val attack: Int,
//    @JsonName("def") val defence: Int,
    val name: String,
    val attack: Int,
    val defence: Int,
    val traits: List<Trait>,
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

private fun iterableToJson(any: Iterable<*>): String {
    TODO("Logic for serializing Iterable")
}

private fun mapToJson(any: Map<*, *>): String {
    TODO("Logic for serializing Map")
}

fun main() {
    val creature = Creature(
        name = "Cockatrice",
        attack = 2,
        defence = 4,
        traits = listOf(Trait.FLYING),
        cost = mapOf(
            Element.ANY to 3,
            Element.FOREST to 2
        )
    )
    println(creature.toJson())
    // Step 2: {"name": "Cockatrice", "att": 2, "cost": {"ANY": 3, "FOREST": 2}, "def": 4, "traits": ["FLYING"]}
    // Step 3: {"name": "Cockatrice", "att": 2, "cost": {"ANY": 3, "FOREST": 2}, "def": 4, "traits": ["FLYING"]}
}
