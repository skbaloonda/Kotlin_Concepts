package com.example.basicandroidkotlinconcept.Functions

// functions are reusable blocks of code that perform a specific task.
// They help in organizing code, improving readability, and reducing redundancy.
// A function can take input parameters, perform operations, and return a result.
// main function is the entry point of a Kotlin program where the execution starts.
// syntax to declare a function in Kotlin:
/*
fun functionName(parameter1: Type, parameter2: Type): ReturnType {
    // function body
    return result
}
*/

// Types of Functions in Kotlin:
// 1. Standard Functions :
/* fun add(a: Int, b: Int): Int {
    return a + b
}
* */

// 2. Higher-Order Functions : Functions that take other functions as parameters or return functions as results.
/* fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
*/

// 3. Inline Functions : Functions that are marked with the inline keyword to reduce the overhead of function calls by inlining the function's bytecode at the call site.
/* inline fun inlineFunctionExample(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
*/

// 4. Recursive Functions : Functions that call themselves to solve a problem.
/* fun factorial(n: Int): Int {
    return if (n == 1) 1 else n * factorial(n - 1)
}
*/

// 5. Lambda Functions: Anonymous functions that can be treated as values and passed around.
/* val sum: (Int, Int) -> Int = { x, y -> x + y }
*/

// 6. Extension Functions: Functions that add new functionality to existing classes without modifying their source code.
/* fun String.reverse(): String {
    return this.reversed()
}
*/

// 7. Tail Recursive Functions: Functions that are optimized for recursion by the compiler to avoid stack overflow.
/* tailrec fun tailRecursiveFactorial(n: Int, accumulator: Int = 1): Int {
    return if (n == 1) accumulator else tailRecursiveFactorial(n - 1, n * accumulator)
}
*/

// 8. Local Functions: Functions defined within another function to encapsulate functionality.
/* fun outerFunction() {
    fun localFunction() {
        println("This is a local function")
    }
    localFunction()
}
*/


// 9. Member Functions: Functions that are defined within a class and operate on the class's properties.
/* class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}
*/

// 10. Anonymous Functions: Functions without a name, often used as arguments to higher-order functions.
/* val multiply = fun(a: Int, b: Int): Int {
    return a * b
}
*/
