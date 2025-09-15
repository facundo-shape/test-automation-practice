package com.facundo.course.chapter3.unit7

fun main() {
    val medical = MedicalAccount("Medical account")
    val doctor = DoctorAccount("Doctor account")
    val patient = PatientAccount("Patient account")

    medical.notification()
    doctor.notification()
    patient.notification()
}