package com.example.basicandroidkotlinconcept.Nullability

fun main(){
    // Non-null assertion operator (!!) -> A developer guarantee that the variable is not null
    // Can trigger a program crash if the variable is actually null
    // Try to avoid it as much as possible

    val name: String? = "Ram"

    println(name!!.length)

    val name1: String? = null

    println(name1!!.length) // This will throw a NullPointerException


}