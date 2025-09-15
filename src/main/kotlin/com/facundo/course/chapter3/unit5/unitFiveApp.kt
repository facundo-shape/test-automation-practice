package com.facundo.course.chapter3.unit5

fun main() {
    val bankAccount = BankAccount()
    bankAccount.deposit((10.0))
    println(bankAccount.getBalance())

    val person = Person()
    person.showFullName()

    val myRecipe = Recipe()
    myRecipe.name = "Scrambled eggs"
    println("Recipe name: $myRecipe.name, ${myRecipe.printIngredients()}")
}