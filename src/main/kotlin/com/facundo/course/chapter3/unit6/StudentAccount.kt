package com.facundo.course.chapter3.unit6

class StudentAccount(
    username: String,
    email: String,
    val studentId: Int
) : UniversityAccount(username, email) {
    fun showStudentInfo() {
        println("Username: $username, email: $email, student id: $studentId")
    }
}