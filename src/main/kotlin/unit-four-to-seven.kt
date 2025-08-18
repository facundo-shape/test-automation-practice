package org.example

import java.time.Month

fun main(){
    println(unitFourAssignmentOneTaskOne(-3))
    println(unitFiveAssignmentOneTaskTwo(7))
    println(unitFiveAssignmentTwoTaskOne(4))
    println(unitFiveAssignmentTwoTaskTwo(7))
    unitSixAssignmentThreeTaskOne()
    unitSixAssignmentThreeTaskTwo(5)
    unitSevenAssignmentFourTaskOne()
    unitSevenAssignmentFourTaskTwo()
    unitEightAssignmentFiveTaskOne()
    println(unitEightAssignmentFiveTaskTwo())
}

fun unitFourAssignmentOneTaskOne(numberToCheck: Int): String {
    return if (numberToCheck < 0)
        "It's negative"
    else if (numberToCheck == 0)
        "It's zero"
    else "It's positive "
}

fun unitFiveAssignmentOneTaskTwo(numberToCheck: Int): String {
    return if (numberToCheck % 2 == 0)
        "It's even"
    else "It's odd"
}

fun unitFiveAssignmentTwoTaskOne(grade: Int): String {
    return when (grade) {
        1 -> "Terrible"
        2 -> "Bad"
        3 -> "Okay"
        4 -> "Good"
        5 -> "Excellent"
        else -> "Grade out of range"
    }
}

fun unitFiveAssignmentTwoTaskTwo(month: Int): String {
    return when (month) {
        in 1 .. 3 -> "Winter"
        in 4 .. 6 -> "Spring"
        in 7 .. 9 -> "Summer"
        in 10 .. 12 -> "Autumn"
        else -> "Month out of range"
    }
}

fun unitSixAssignmentThreeTaskOne() {
    for (i in 1..10)
        print("$i \t")
}

fun unitSixAssignmentThreeTaskTwo(tableNumber: Int){
    for (numberInRange in 0 .. 10)
        println("$tableNumber x $numberInRange = ${tableNumber*numberInRange}")
}

fun unitSevenAssignmentFourTaskOne() {
    val evenNumbers = 2 .. 20 step 2
    for (numberInRange in evenNumbers)
        print("$numberInRange \t")
    println()
}

fun unitSevenAssignmentFourTaskTwo() {
    val reversedRangeOfNumbers = 10 downTo 1
    for (i in reversedRangeOfNumbers)
        print("$i \t")
    println()
}

fun unitEightAssignmentFiveTaskOne() {
    val names = arrayOf("Tom", "Sam", "Bob")
    for (name in names)
        println(name)
}

fun unitEightAssignmentFiveTaskTwo(): Int {
    val numbers = arrayOf(3, 10, 23, -8, 17)
    var sumOfNumbers = 0
    for (number in numbers)
        sumOfNumbers += number
    return sumOfNumbers
}