package com.facundo.course.chapter3.unit6

open class UniversityAccount(
    open val username: String,
    open val email: String
) {
    fun showInfo(){
        println("Username: $username, email: $email")
    }
}