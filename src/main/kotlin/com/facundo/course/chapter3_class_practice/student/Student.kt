package com.facundo.course.chapter3_class_practice.student

open class Student(val name: String, protected var grade: Int) {
    fun showGrade() {
        println("Name: $name, grade: $grade")
    }
}