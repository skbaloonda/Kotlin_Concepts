package com.example.basicandroidkotlinconcept.Functions

// Higher-Order Functions: Functions that can take other functions as parameters or return functions as results.
fun main() {

    val addition:(Int,Int)->Int = { x: Int, y: Int -> x + y } // Lambda function for addition
    val multiplication:(Int,Int)->Int = { x: Int, y: Int -> x * y } // Lambda function for multiplication

    // Using the higher-order function with a lambda function for addition
    val sum = operateOnNumbers(5, 10, addition)   // we can directly pass the lambda function as an argument
    println("Sum of 5 and 10 is: $sum")                 // val sum = operateOnNumbers(5, 10, { x, y -> x + y })
                                                        // or we can use the shorthand syntax
                                                        // val sum = operateOnNumbers(5, 10) { x, y -> x + y }

    // Using the higher-order function with a lambda function for multiplication
    val product = operateOnNumbers(5, 10, multiplication)
    println("Product of 5 and 10 is: $product")



    // Using the higher-order function to get a greeting function
    val greetHello = getGreetingFunction("Hello")
    val greetHi = getGreetingFunction("Hi")

    println(greetHello("Sunil")) // Output: Hello, Sunil!
    println(greetHi("Sunil"))   // Output: Hi, Sunil!
}

// Higher-order function that takes a function as a parameter
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
} // explain this method : This method 'operateOnNumbers' takes two integers 'a' and 'b', and a function 'operation' as parameters.
// The 'operation' function itself takes two integers and returns an integer.
// The 'operateOnNumbers' function calls the 'operation' function with 'a' and 'b' as arguments and returns the result.

// Higher-order function that returns a function
fun getGreetingFunction(greeting: String): (String) -> String { // This function takes a string 'greeting' as a parameter and returns another function.
    return { name: String -> "$greeting, $name!" }
}