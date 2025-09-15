package com.facundo.course.chapter3.unit6

fun main() {
    val university = UniversityAccount("Math teacher", "math@university.com")
    val student = StudentAccount("John student", "john@university.com", 123)

    university.showInfo()
    student.showStudentInfo()
}