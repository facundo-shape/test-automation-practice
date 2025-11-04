package com.facundo.course.chapter3.unit7

open class MedicalAccount(val username: String) {
    open fun notification(){
        println("General medical notification for $username")
    }
}