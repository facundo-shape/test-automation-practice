package com.facundo.course.chapter3.unit2

class Book(val title: String, val author: String) {
    init {
        println("Book created: $title by $author")
    }
    constructor(title: String) : this(title, "Unknown")

}