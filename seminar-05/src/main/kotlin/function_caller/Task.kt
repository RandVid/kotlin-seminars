package function_caller

import kotlin.reflect.KFunction
import kotlin.reflect.KType
import kotlin.reflect.typeOf

class FunctionCaller {
    private val constants = mutableMapOf<KType, Any?>()

    fun setConstant(type: KType, value: Any?) {
        TODO("Store the value in the constants map using the type as the key")
    }

    fun <T> call(function: KFunction<T>): T {
        TODO("Map function parameters to stored constants, throw an exception if missing")

        return TODO("Use callBy() to invoke the function with the arguments")
    }
}

fun printStrIntNum(str: String, int: Int, num: Number) {
    println("str: $str, int: $int, num: $num")
}

fun main() {
    val caller = FunctionCaller()

    // Setting constants for the function parameters
    caller.setConstant(typeOf<String>(), "ABC")   // String value for 'str'
    caller.setConstant(typeOf<Int>(), 123)         // Int value for 'int'
    caller.setConstant(typeOf<Number>(), 3.14)     // Number value for 'num'

    // Call function with the provided constants
    caller.call(::printStrIntNum)
    // Output: str: ABC, int: 123, num: 3.14
}
