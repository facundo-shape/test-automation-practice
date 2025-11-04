package com.facundo.course.chapter3_class_practice.employee

fun main() {
    val emp = Employee("Mark", 1000.0)
    emp.giveRaise(500.0)
    emp.showInfo()
}