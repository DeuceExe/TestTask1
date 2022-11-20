package com.example.testtask1

fun main() {
    print("Enter ticket number: ")
    val ticketNumber = readln().toInt()
    checkTicket(ticketNumber)
}

fun checkTicket(ticket: Int): Boolean{
    var checker = false
    var number = ticket
    var digit: Int
    var digitOfNumber: Array<Int> = arrayOf()
    var sumFirstHalf = 0
    var sumSecondHalf = 0

    while(number > 0){
        digit = number % 10
        digitOfNumber += digit
        number /= 10
    }

    val arraySize = digitOfNumber.size
    val firstHalf = digitOfNumber.copyOfRange(0, (arraySize / 2))
    val secondHalf = digitOfNumber.copyOfRange((arraySize / 2), arraySize)

    if(arraySize < 8 && arraySize % 2 == 0){
        for(n in firstHalf.indices){
            sumFirstHalf += firstHalf[n]
        }
        for(n in secondHalf.indices){
            sumSecondHalf += secondHalf[n]
        }
    }
    if(sumFirstHalf == sumSecondHalf){
        checker = true
        println("Ticket number $ticket is winning")
    }else{
        println("Ticket number $ticket is losing")
    }
    return checker
}