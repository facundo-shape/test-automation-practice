package com.facundo.course.chapter5.lists

class Student(val name: String, private val grades: List<Int>) {

    fun averageGrades(): Double {
        return grades.average()
    }
}