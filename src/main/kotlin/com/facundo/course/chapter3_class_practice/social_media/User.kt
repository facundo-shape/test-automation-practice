package com.facundo.course.chapter3_class_practice.social_media

class User(val name: String, age: Int) {
    var age = age
        set(value) {
            if (value in 13..120) field = value
        }
    val isTeen: Boolean
        get() = age in 13..19

    fun sendMessage() {
        println("Hello from $name")
    }

}