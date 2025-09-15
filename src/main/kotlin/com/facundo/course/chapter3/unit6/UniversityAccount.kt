package com.facundo.course.chapter3.unit6

open class UniversityAccount(
    val username: String,
    val email: String
) {
    fun showInfo(){
        println("Username: $username, email: $email")
    }
}