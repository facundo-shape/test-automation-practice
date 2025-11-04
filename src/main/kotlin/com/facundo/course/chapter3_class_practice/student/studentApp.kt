package com.facundo.course.chapter3_class_practice.student

fun main() {
    val normalStudent = Student("Harold", 3)
    val greatStudent = HonorStudent("Manny", 80)
    greatStudent.boostGrade()
    normalStudent.showGrade()
    greatStudent.showGrade()
}