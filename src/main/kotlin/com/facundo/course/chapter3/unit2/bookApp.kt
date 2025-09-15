package com.facundo.course.chapter3.unit2

fun main(){
    val book = Book("The interesting title", "Good author")
    println("Book title: ${book.title}, book author ${book.author}")
    val book2 = Book("Another title")
}