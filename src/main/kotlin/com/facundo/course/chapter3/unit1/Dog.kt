package com.facundo.course.chapter3.unit1

class Dog(var name: String, var age: Int) {

    fun bark() {
        print("Woof! My name is $name")
    }

    fun printProperties(){
        println("My name is $name, and my age is $age")
    }
}