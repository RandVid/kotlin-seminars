# Implement Fraction Class in Kotlin

## Seminar Outcomes

In this assignment, you will implement a `Fraction` class in Kotlin that represents mathematical fractions and supports various operations. This exercise will cover:

- Encapsulation
- Operator overloading
- Custom constructors

---

## Task 1: Define the `Fraction` Class

Create a class named `Fraction` that stores:

- `numerator: Int`
- `denominator: Int`

---

## Task 2: Implement Constructors

### Constructor 1: Accepting Two Parameters
```kotlin
Fraction(numerator: Int, denominator: Int)
```
- Must validate that the denominator is not zero.

### Constructor 2: Accepting a Single Integer Parameter
```kotlin
Fraction(numerator: Int)
```
- The denominator defaults to `1`.

### **Bonus Task**: Constructor Accepting a Double Value
```kotlin
Fraction(value: Double)
```
- Converts a double value into a fraction (e.g., `7.5` → `15/2`).

---

## Task 3: Implement `toString()` Method

- Returns the fraction in the format: `"numerator/denominator"`.

---

## Task 4: Implement Custom Getters

Define getters that print a message before returning the value:

- **For numerator:** Prints `"This is a numerator: [value]"`
- **For denominator:** Prints `"This is a denominator: [value]"`

---

## Task 5: Implement Arithmetic Operators

Overload the following operators for `Fraction`:

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`)

---

## Task 6: Implement Equality and Comparison

Implement the following methods:

- `equals()`: Checks if two fractions are equal.
- `compareTo()`: Allows fraction comparison.

---

## Bonus Tasks

- Ensure all fractions are stored in their **simplified form** (e.g., `20/15` → `4/3`).
- Implement an **extension function** `toDecimal()` that converts a fraction to its decimal form.
