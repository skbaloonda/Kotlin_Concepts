package com.example.basicandroidkotlinconcept.Functions

fun main(){
    val names = arrayListOf("Sunil","John","Doe","Smith")
    val personalisedMessage = update(names){ name -> "Hello, $name! how are you" }
    for (message in personalisedMessage){
        println(message)
    }
}

fun update(names:ArrayList<String>, getMessage:(String) -> String):ArrayList<String>{

    val messages = arrayListOf<String>()
    for (name in names){
        val message = getMessage(name)
        messages.add(message)
    }
    return messages

}