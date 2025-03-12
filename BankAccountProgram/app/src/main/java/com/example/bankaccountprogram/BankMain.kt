package com.example.bankaccountprogram

fun main(){
    val myBankAccount = BankAccount("Aryan", 12500.50)
    println(myBankAccount.accountHolder)
    myBankAccount.deposit(1000.00)
    myBankAccount.displayTransactionHistory()
    myBankAccount.withdraw(500.00)
    myBankAccount.displayTransactionHistory()

    println("${myBankAccount.accountHolder}'s account has a balance of ${myBankAccount.balance}")
    println(myBankAccount.acctBalance())
}
