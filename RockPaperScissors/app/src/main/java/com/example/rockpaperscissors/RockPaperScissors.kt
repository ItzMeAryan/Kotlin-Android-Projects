package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper, Scissors? Enter your Choice!")
    playerChoice = readln().toString()

    val randomNumber = (1..3).random()
    if(randomNumber == 1){
        computerChoice = "Rock"
    }else if(randomNumber == 2){
        computerChoice = "Paper"
    }else if(randomNumber == 3){
        computerChoice = "Scissors"
    }
    println(computerChoice)

    if((playerChoice == "Rock" && computerChoice == "Paper") || (playerChoice == "Paper" && computerChoice == "Scissors")|| (playerChoice == "Scissors" && computerChoice == "Rock")){
        println("Oh! You failed as Computer chooses $computerChoice")
    }else if((playerChoice == "Rock" && computerChoice == "Scissors") || (playerChoice == "Paper" && computerChoice == "Rock")|| (playerChoice == "Scissors" && computerChoice == "Paper")){
        println("Wow! You won as Computer chooses $computerChoice")
    }else if((playerChoice.toString() == computerChoice.toString())){
        println("Draw")
    }else{
        println("Ahhh! You overmsart, trying to cheat.")
    }

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "computer"
    }

    if(winner == "Tie"){
        println("It's a tie")
    }else if(winner == "Player"){
        println("Player Won!")
    }else{
        println("Computer Won!")
    }
}