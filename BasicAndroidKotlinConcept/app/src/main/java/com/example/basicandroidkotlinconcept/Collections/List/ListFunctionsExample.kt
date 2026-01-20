package com.example.basicandroidkotlinconcept.Collections.List

fun main (){

    val colors = arrayListOf("Red", "Green", "Blue", "Yellow", "Purple")

    println("Size of the list: ${colors.size}") // Output: Size of the list: 5
    println(colors.contains("Green")) // Output: true

    val newColors = listOf("Red", "Purple")

    println(colors.containsAll(newColors)) // Output: true

    println(colors.indexOf("Blue")) // Output: 2
    println(colors.indexOf("Black"))// Output: -1 // element not found

    colors.set(0,"Orange") // Updating element at index 0

    println("After updating first element: $colors") // Output: After updating first element: [Orange, Green, Blue, Yellow, Purple]

    colors.set(colors.indexOf("Purple"),"Violet") // Updating element by finding its index
    println("After updating Purple to Violet: $colors") // Output: After updating Purple to Violet: [Orange, Green, Blue, Yellow, Violet]

    colors[colors.indexOf("Yellow")] = "Cyan" // Another way to update element
    println("After updating Yellow to Cyan: $colors") // Output: After updating Yellow to Cyan: [Orange, Green, Blue, Cyan, Violet]

    val subColors = colors.subList(1,4) // subList from index 1 to 3
    println("Sublist of colors: $subColors") // Output: Sublist of colors: [Green, Blue, Yellow]
    println(subColors::class.java) // Output: class java.util.ArrayList

    colors.clear() // Removing all elements
    println("After clearing the list: $colors") // Output: After clearing the list: []

    println(colors.isEmpty()) // Output: true


}