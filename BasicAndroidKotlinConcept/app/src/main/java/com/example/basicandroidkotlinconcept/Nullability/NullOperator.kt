package com.example.basicandroidkotlinconcept.Nullability


    fun main(){
        val name = "Sk" // Non-nullable type variable
        val name1: String? = null // Nullable type variable
                                    // Using null-safe operator(?) to avoid NullPointerException

        println(name+name1)

        // Safe call operator (?.)

        val catName : String? = "Tom"
        println(catName?.length) // Output: 3 // Returns length if catName is not null, else returns null

        // Arthmetic operator with null safety
        // Addition with null safety a?.plus(b)
        // Subtraction with null safety a?.minus(b)
        // Multiplication a.?times(b)
        // Division  a.?div(b)
        // Remainder a.?rem(b)

        println(10?.plus(5)) // Output: 15
        println(10?.minus(5)) // Output: 5

        println("Insert a number")
        val input = readLine() // Reads input from the user
        println(input)

    }

