package com.facundo.course.chapter3_class_practice.employee

class Employee(val name: String, private var salary: Double) {

    fun showInfo() {
        println("Name: $name, salary: $salary")
    }

    fun giveRaise(amount: Double) {
        if (amount > 0.0) salary += amount
    }
}