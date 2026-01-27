package com.example.basicandroidkotlinconcept.HangManGame

import kotlin.random.Random

// Hangman game is a simple word guessing game where the player tries to guess a hidden word by suggesting letters within a certain number of attempts.

// List of words to choose from and game variables

val words = listOf("kotlin", "android", "hangman", "developer", "bridge","show", "store")
var word =""
val gussess = arrayListOf<Char>()
var remainGusses = 6
var mistakes = 0

fun main() {
    setupGame()
}

fun setupGame() {
    // Select a random word from the list
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].uppercase()
    println(word)

    for(i in word.indices){
        gussess.add('_')
    }


    var gameOver = false

    do {
        printGameStatus()

        println("Please enter a letter:")
        val input = readLine()?:""
        if(input.isEmpty()){
            println("Invalid input. Please enter a letter.")

        } else {
            val letter = input[0].uppercaseChar()
            if (word.contains((letter))){
                for (i in word.indices){
                    if(word[i]==letter){
                        gussess[i]=letter
                    }
                }
                if(!gussess.contains('_')){
                    println("Congratulations! You've guessed the word: $word")
                    gameOver = true
                }
            } else {
                println("Sorry, the letter is not in the word.")
                remainGusses--
                mistakes++
                if(mistakes==6){
                    gameOver = true
                }
            }
        }
    }while (!gameOver)

    if (mistakes==6){
        printGameStatus()
        println("Game Over! You Lost The word was: $word")
    } else{
        println(" You Win!")
    }

}

fun printGameStatus(){
    when(mistakes){
        0 -> print0Mistakes()
        1 -> print1Mistakes()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }
    print("Word: ")
    for(element in gussess)
        print("$element ")
    println("\nYou Have $remainGusses guss(es) left")
}


fun print0Mistakes(){
    println(" |------|_")
    println(" |      | ")
    println(" |        ")
    println(" |        ")
    println(" |        ")
    println(" |        ")
    println(" |        ")
    println("/|\\      ")
    println("/|\\      ")
}

fun print1Mistakes(){
    println(" |------|_")
    println(" |      | ")
    println(" |      O ")
    println(" |        ")
    println(" |        ")
    println(" |        ")
    println(" |        ")
    println("/|\\      ")
    println("/|\\      ")
}

fun print2Mistakes(){
    println(" |------|_")
    println(" |      | ")
    println(" |      O ")
    println(" |     /| ")
    println(" |        ")
    println(" |        ")
    println(" |        ")
    println("/|\\      ")
    println("/|\\      ")
}

fun print3Mistakes(){
    println(" |------|_")
    println(" |      | ")
    println(" |      O ")
    println(" |     /| ")
    println(" |      | ")
    println(" |        ")
    println(" |        ")
    println("/|\\      ")
    println("/|\\      ")
}

fun print4Mistakes(){
    println(" |------|_")
    println(" |      | ")
    println(" |      O ")
    println(" |     /|\\ ")
    println(" |      | ")
    println(" |        ")
    println(" |        ")
    println("/|\\      ")
    println("/|\\      ")
}

fun print5Mistakes(){
    println(" |------|_")
    println(" |      | ")
    println(" |      O ")
    println(" |     /|\\ ")
    println(" |      | ")
    println(" |     /  ")
    println(" |        ")
    println("/|\\      ")
    println("/|\\      ")
}

fun print6Mistakes(){
    println(" |------|_")
    println(" |      | ")
    println(" |      O ")
    println(" |     /|\\ ")
    println(" |      | ")
    println(" |     / \\")
    println(" |        ")
    println("/|\\      ")
    println("/|\\      ")
}


