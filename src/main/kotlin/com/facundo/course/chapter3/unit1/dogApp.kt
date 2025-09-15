package com.facundo.course.chapter3.unit1

fun main() {
    val rocco: Dog = Dog("Rocco", 3)
    println("Dog name: ${rocco.name}, dog age: ${rocco.age}")
    rocco.bark()

    val sam: Dog = Dog("Sam", 15)
    val donny: Dog = Dog("Donny", 6)
    val cindy: Dog = Dog("Cindy", 4)
    sam.printProperties()
    donny.printProperties()
    cindy.printProperties()
}