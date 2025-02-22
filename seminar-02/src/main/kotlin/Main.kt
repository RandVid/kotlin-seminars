import kotlin.math.abs
import kotlin.math.roundToInt

class Fraction(numerator: Int, denominator: Int) : Comparable<Fraction> {
    val numerator: Int
    val denominator: Int

    init {
        require(denominator != 0) { "Denominator cannot be zero" }
        val gcd = gcd(abs(numerator), abs(denominator))
        this.numerator = if (denominator < 0) -numerator / gcd else numerator / gcd
        this.denominator = abs(denominator) / gcd
    }

    constructor(numerator: Int) : this(numerator, 1)
    constructor(value: Double) : this((value * 1000000).roundToInt(), 1000000)

    override fun toString(): String = "$numerator/$denominator"

    val num: Int
        get() {
            println("This is a numerator: $numerator")
            return numerator
        }

    val denom: Int
        get() {
            println("This is a denominator: $denominator")
            return denominator
        }

    operator fun plus(other: Fraction): Fraction =
        Fraction(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator)

    operator fun minus(other: Fraction): Fraction =
        Fraction(numerator * other.denominator - other.numerator * denominator, denominator * other.denominator)

    operator fun times(other: Fraction): Fraction =
        Fraction(numerator * other.numerator, denominator * other.denominator)

    operator fun div(other: Fraction): Fraction {
        require(other.numerator != 0) { "Cannot divide by zero" }
        return Fraction(numerator * other.denominator, denominator * other.numerator)
    }

    override fun equals(other: Any?): Boolean =
        other is Fraction && this.numerator == other.numerator && this.denominator == other.denominator

    override fun compareTo(other: Fraction): Int =
        (this.numerator * other.denominator).compareTo(other.numerator * this.denominator)
}

fun Fraction.toDecimal(): Double = numerator.toDouble() / denominator.toDouble()

private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

fun main() {
    val f1 = Fraction(3, 4)
    val f2 = Fraction(5, 6)
    println(f1)
    println(f2)
    println(f1 + f2)
    println(f1 - f2)
    println(f1 * f2)
    println(f1 / f2)
    println(f1.toDecimal())
}
