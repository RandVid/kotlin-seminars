# JSON Serialization

In this task, you will implement a `toJson` function that converts a Kotlin object into a JSON string representation

## Instructions

1. **Implement the `objectToJson` function**:
   - Use reflection to get the list of properties from the class.
   - Use the [`joinToString`](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/join-to-string.html) function to join property-value pairs into a JSON-like structure.

2. **Implement the `valueToJson` function**:
   - Handle different types of values (e.g., numbers, strings, collections).
   - Ensure proper formatting for JSON, like wrapping strings in quotes.


## Expected result from running the main function

```json
{"attack": 2, "cost": {"ANY": 3, "FOREST": 2}, "defence": 4, "name": "Cockatrice", "traits": ["FLYING"]}
```

Or the pretty-printed version:

```json
{
    "attack": 2,
    "cost": {
        "ANY": 3,
        "FOREST": 2
    },
    "defence": 4,
    "name": "Cockatrice",
    "traits": ["FLYING"]
}
```
