package com.example.basicandroidkotlinconcept.Functions

fun main (){
    val clients = listOf("Alice", "Bob", "Charlie", "Diana","Ram")

    // Using forEach higher-order function to iterate over the list
    clients.forEach { client ->
        println("Sending email to $client")
    }

    // filter higher-order function to filter the list
    clients.filter{it.length<5}.forEach{
        println("Short name client: $it")
    }

    // map higher-order function to transform the list

    val sizes = clients.map{it.length}// return a list of integers representing the lengths of each client's name
    println(sizes)

    // sortedBy higher-order function to sort the list

    val sortedClients = clients.sortedBy { it.length } // Sort clients by the length of their names, return a new list
    println(sortedClients)

    val sortedByLastLetter = clients.sortedBy { it.last() } // Sort clients by the last letter of their names, return a new list
    val sortedByLastCharacter = clients.sortedBy { it[it.length - 1] } // Another way to sort by last character
    println("Sorted by last character of name"+sortedByLastLetter)
    println("Sorted by last letter of name"+sortedByLastCharacter)

    // maxBy higher-order function to find the client with the longest name

    val longestNameClient = clients.maxByOrNull { it.length }// return a string with the longest length
    println("Client with the longest name: $longestNameClient")

    val ints = listOf(372,286,836,196,216,877)
    println(ints.maxBy{it.toString()[1].toInt()}) // Find the integer with the highest value in the middle digit
    println(ints.maxBy { it/10 %10 }) // Another way to find the integer with the highest value in the middle digit


    // minBy higher-order function to find the client with the shortest name
    val shortestNameClient = clients.minByOrNull { it.length } // return a string with the shortest length
    println("Client with the shortest name: $shortestNameClient")
}