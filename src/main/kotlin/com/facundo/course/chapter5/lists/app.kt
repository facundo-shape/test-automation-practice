package com.facundo.course.chapter5.lists

fun main() {
    val numbers = listOf(1,2,3,4,5,6)
    val math = MathUtils()

    println("The sum of all even numbers is ${math.sumAllEvenNumbers(numbers)}")

    val johnGrades = listOf(2,6,4,8,10,4)
    val johnStudent = Student("John", johnGrades)
    println("The average grade for ${johnStudent.name} is ${johnStudent.averageGrades()}")
}