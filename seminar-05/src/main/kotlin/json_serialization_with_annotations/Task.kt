package json_serialization_with_annotations

import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.findAnnotation

@Target(AnnotationTarget.PROPERTY)
annotation class JsonName(val name: String)

@Target(AnnotationTarget.PROPERTY)
annotation class JsonIgnore

class Creature(
    @JsonIgnore val name: String,
    @JsonName("att") val attack: Int,
    @JsonName("def") val defence: Int,
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
    TODO("Implement logic for serializing objects")
}

private fun valueToJson(value: Any?): String {
    TODO("Implement logic for serializing values")
}

private fun iterableToJson(any: Iterable<*>): String {
    TODO("Implement logic for serializing Iterable")
}

private fun mapToJson(any: Map<*, *>): String {
    TODO("Implement logic for serializing Map")
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
}
