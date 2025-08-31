package com.facundo.course.chapter2

fun main() {
    greet("Greg")
    displayUser("Greg", 30)
    showMessage("I would like this message to be printed, thanks")
    showMessage("I'm calling the showMessage function again with a different message")
    printNumbers(2,5,8,10)
    printNumbers(45, 45, 4, 90, 16)
    concatStrings("Give", "me", "this", "all", "together")
    addToGroup("QA Team", "Fie", "Jeremy", "Søren", "Kathrin")
    println(multiply(2,4))
    println(isEven(3))
    printIfPositive(-3)
    printIfPositive(8)
    println(cube(4))
    checkAndPrint(4)
    checkAndPrint(-1)
    compare(1, 8)
    compare(12, 12)
    compare(8, 12)
    show(10)
    show("Hola boy")
    println(max(4, 12))
    println(max(54.43, 43.34))
    println(sum(3, 4))
    println(sum(5, 8, 6))
}

// Unit 1. Functions and Their Parameters

fun greet(name: String) {
    println("Hello $name!")
}

fun displayUser(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

fun showMessage(message: String) {
    println(message)
}

// Unit 2. Vararg Parameters

fun printNumbers(vararg numbers: Int) {
    for (number in numbers)
        println(number)
}

fun concatStrings(vararg stringsToConcatenate: String){
    println(stringsToConcatenate.joinToString(" "))
}

fun addToGroup(groupName: String, vararg userNames: String) {
    val groupMembers = userNames.joinToString(" ")
    print("Group name: $groupName\nUser names: $groupMembers")
}

// Unit 3. Returning Results

fun multiply(numberOne: Int , numberTwo: Int): Int {
    return numberOne * numberTwo
}

fun isEven(number: Int): Boolean {
    return number%2 == 0
}

fun printIfPositive(number: Int): Unit {
    if (number<=0)
        return
    println(number)
}

// Unit 4. Single-Expression and Local Functions

fun cube(number: Int) = number * number * number

fun checkAndPrint(number: Int) {
    fun isValid(value: Int) {
        if (value>= 0)
            println("Valid")
        else println("Invalid")
    }
    isValid(number)
}

fun compare(numberOne:Int, numberTwo: Int) {
    fun isLessThanTen(valueOne: Int, valueTwo: Int) = valueOne < 10 && valueTwo < 10
    if (isLessThanTen(numberOne, numberTwo))
        println("Both less than 10")
    else println("Not both less than 10")
}

// Unit 5. Function Overloading

fun show(numberToShow: Int) = println(numberToShow)
fun show(stringToShow: String) = println(stringToShow)

fun max(intOne: Int, intTwo: Int) = Integer.max(intOne, intTwo)
fun max(doubleOne: Double, doubleTwo: Double) = maxOf(doubleOne, doubleTwo)

fun sum(numberOne: Int, numberTwo: Int) = numberOne + numberTwo
fun sum(numberOne: Int, numberTwo: Int, numberThree: Int) = numberOne + numberTwo + numberThree