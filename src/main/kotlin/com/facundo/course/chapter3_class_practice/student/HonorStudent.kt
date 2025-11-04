package com.facundo.course.chapter3_class_practice.student

class HonorStudent(name: String, grade: Int) : Student(name, grade) {
    fun boostGrade() {
        if (grade < 100) grade += 5
    }
}