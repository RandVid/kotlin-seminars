# JSON Serialization with Annotations

In this task, you will enhance the `toJson` function to respect two custom annotations: `JsonName` and `JsonIgnore`. These annotations help in customizing how properties are serialized into JSON.

## Instructions

1. **Implement the `JsonName` annotation**:
   - This annotation allows customizing the property name when serializing the object. If a property has the `@JsonName` annotation, its value should be used instead of the default property name.

2. **Implement the `JsonIgnore` annotation**:
   - This annotation should mark properties that should be excluded from the serialized JSON output. If a property has the `@JsonIgnore` annotation, it should be ignored during serialization.

3. **Modify the `objectToJson` function**:
   - Filter out properties marked with the `JsonIgnore` annotation.
   - For properties with the `JsonName` annotation, use the specified name instead of the original property name.

## Expected Result

```json
{"att": 2, "cost": {"ANY": 3, "FOREST": 2}, "def": 4, "traits": ["FLYING"]}
```

Or the pretty-printed version:

```json
{
    "att": 2,
    "cost": {
        "ANY": 3,
        "FOREST": 2
    },
    "def": 4,
    "traits": ["FLYING"]
}
```

