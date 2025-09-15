package com.facundo.course.chapter3.unit5

class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0.0) balance += amount
    }

    fun getBalance(): Double = balance
}