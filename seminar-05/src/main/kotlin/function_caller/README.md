# Function Caller

In this task, you will implement a FunctionCaller class that dynamically calls functions with constant values provided by type.


## Instructions

1. **Implement the setConstant function:**
    - This method stores a constant value for a specific `KType` in an internal map using `KType` as the key.

2. **Implement the call function:**
    - Call a function using stored constants.
    - Throw an exception if a required constant is missing.
    - Use the [`callBy`](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.reflect/-k-callable/call-by.html) function