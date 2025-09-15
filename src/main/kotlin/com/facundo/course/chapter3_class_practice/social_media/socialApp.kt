package com.facundo.course.chapter3_class_practice.social_media

fun main() {
    val userOne = User("Harry", 30)
    val userTwo = User("Sally", 16)

    userOne.sendMessage()
    userTwo.sendMessage()

    println("Is user ${userOne.name} teen? ${userOne.isTeen}")
    println("Is user ${userTwo.name} teen? ${userTwo.isTeen}")
}