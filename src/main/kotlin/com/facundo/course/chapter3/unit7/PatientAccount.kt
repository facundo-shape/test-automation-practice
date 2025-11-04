package com.facundo.course.chapter3.unit7

class PatientAccount(username: String) : MedicalAccount(username) {
    override fun notification() {
        println("Patient reminder for $username")
    }
}