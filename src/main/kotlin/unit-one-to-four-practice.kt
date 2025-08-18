package org.example

fun main() {

}

fun assignmentOne() {
    // Create a variable called daysInWeek with the value 7. Don't write the type — let Kotlin figure it out.
    val daysInWeek = 7
}

fun assignmentTwo() {
    // Make a variable called userScore with a starting value of 0. Add 10 to it and print the result.
    var userScore = 0
    userScore += 10
    println(userScore)
}

fun assignmentThree(): Int {
    // Create width and height variables. Find the area of a rectangle.
    val width: Int = 3
    val height: Int = 5
    val rectangleArea = width * height
    return rectangleArea
}

fun assignmentFour(): Double {
    // Make a variable pi with type Double and value 3.14159.
    val pi: Double = 3.114159
    return pi
}

fun assignmentFive() {
    // Add a comment explaining a variable that stores a user's name.
    // Variable that stores the users name in a string format
}

fun assignmentSix(): Boolean {
    // Check if the number 25 is even, and store the result in isEven.
    var isEven: Boolean
    var numberToEvaluate = 25
    isEven = ((numberToEvaluate % 2) == 0)
    return isEven
}

fun assignmentSeven(): String {
    // Combine firstName and lastName into one variable called fullName.
    val firstName = "Facundo"
    val lastName = "Villarroel"
    val fullName = "$firstName $lastName"
    return fullName
}

fun assignmentEight() {
    /*
    Why does this code not compile? Fix it and explain in a comment.

        // Original code with error
        fun main() {
            val balance = 100
            balance = 120 // Error here
            println(balance)
        }
     */

    // Trying to reassign value to a constant
    val balance = 100
    println(balance)
}

fun assignmentNine(): Boolean {
    // Check if myAge is enough to meet requiredAge.
    val requiredAge = 30
    var myAge = 37
    return myAge>requiredAge
}

fun assignmentTen() {
    // Describe the logic of code that calculates a price with a discount.

    /*
    To calculate a price discount this function takes as a parameter the price and the discount percentage,
    where it applies the discount my means of diving the percentage parameter by 100 and multiplying the result
    by the price of the item, returning the item price as Double
     */
}

fun assignmentEleven() {
    // Store whether a user is active. Pick the best type and assign true.
    var isUserActive: Boolean = true
}

fun assignmentTwelve() {
    // Print a message about the temperature. If it's over 20, say "It is warm", otherwise say "It is cold".
    var temperature = 22
    val message = "$temperature is ${if(temperature>20) "is hot" else "is cold"}"
    println(message)
}

fun assignmentThirteen() {
    // Count apples in baskets and some extra apples.
}

fun assignmentFourteen(): Boolean {
    // See if the door can be opened: you need both a key and the password.
    val doorKey = false
    val doorPassword = true
    val accessGranted = doorKey && doorPassword
    return accessGranted
}

fun assignmentFifteen() {
    // Increase messageCount by 1 and print the result.
    var messageCount = 0
    println(messageCount++)
}