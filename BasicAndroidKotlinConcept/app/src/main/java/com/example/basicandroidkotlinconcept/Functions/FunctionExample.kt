package com.example.basicandroidkotlinconcept.Functions

fun main (){
    val result = add(3,7) // calling add function and storing the result
   println(result) // printing the result
    val people = listOf("Alice", "Bob", "Charlie")
    listOfPeoples(people)

    greetUser()// calling function without argument, will use default value
    greetUser("Ram")// calling function with argument


    for(person in people){
       val message = personalizedGreet(person) // calling function and storing returned value
        println(message)
    }

    // Function Overloading examples
    val prod1 = multiply(2, 3) // calls Int version
    val prod2 = multiply(2.5, 4.0) // calls Double version
    val prod3 = multiply(2, 3, 4) // calls three Int parameters version
    println("Product of 2 and 3 (Int): $prod1")
    println("Product of 2.5 and 4.0 (Double): $prod2")
    println("Product of 2, 3 and 4 (Int): $prod3")

    // Vararg function example
    val totalSum = sumAll(1, 2, 3, 4, 5) // calling vararg function
    println("Sum of all numbers: $totalSum")

    // Local function example
    outerFunction() // calling the outer function which contains a local function
}

// Standard Function Example
fun add(a: Int, b: Int): Int {// Int is the return type of function
    return a + b // returns the sum of a and b
}

// Function that takes a collection of strings and prints each name
fun listOfPeoples(people : Collection<String>) {// function accepts a collection of strings as parameter
    for (person in people) {
        println(person)
    }
}

// function which have default value to parameter
fun greetUser(name: String = "Sunil") {
    println("Hello, $name!")
}

fun personalizedGreet(name: String): String { // function that returns a string
    val greeting = when(name[0]){
        'A' -> "Welcome, $name! You are fantastic!"
        'B' -> "Hello, $name! Your are awesome!"
        else -> "Hi, $name! Nice to meet you."
    }
    return greeting
}

// Function Overloading is a feature that allows multiple functions to have the same name but with different parameter lists (different types or number of parameters).
fun multiply(a: Int, b: Int): Int {
    return a * b
}
fun multiply(a: Double, b: Double): Double {
    return a * b
}
fun multiply(a: Int, b: Int, c: Int): Int {
    return a * b * c
}

// Functions - Vararg : Functions can accept a variable number of arguments using the vararg keyword.
fun sumAll(vararg numbers: Int): Int { // function that takes variable number of Int arguments
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

// Local Function Example
fun outerFunction() {
    fun localFunction() { // local function defined within another function, only accessible inside outerFunction
        println("This is a local function")
    }
    localFunction()
}
