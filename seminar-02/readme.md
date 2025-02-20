# Implement Fraction class
In this assignment, you will implement a `Fraction` class in Kotlin that represents mathematical fractions and supports various operations. 

Seminar outcomes:
* encapsulation
* operator overloading
* custom constructors


### Task 1
Create a class named Fraction that stores: `numerator` (integer); `denominator` (integer)

### Task 2
Implement the following constructors:

1) constructor accepting two parameters:
```numerator (Int)
denominator (Int)
Must validate that denominator is not zero
```

2) constructor accepting:
A single integer parameter (denominator defaults to 1)

3) **bonus task** constructor accepting:
A double value (e.g., `7.5` should be converted to `15/2`)

### Task 3
Implement `toString()` method that returns "numerator/denominator"

### Task 4
Implement custom getters that print a message before returning the value

1) For numerator: "This is a numerator: [value]"

2) For denominator: "This is a denominator: [value]"

### Task 5
Implement the following arithmetic operators:
```
Addition (+)
Subtraction (-)
Multiplication (*)
Division (/)
```

### Task 6
Implement:

```
equals() method
compareTo() method for comparing fractions
```

### Bonus tasks
All fractions must be stored in simplified form: `20 / 15 -> 4 / 3`

Implement extension function for your class, that will allow to convert it to decimal. `Fraction.toDecimal()`
