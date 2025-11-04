package com.facundo.course.chapter3.unit7

class DoctorAccount(username: String) : MedicalAccount(username) {
    override fun notification() {
        println("Doctor alert for $username")
    }
}