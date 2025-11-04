package com.facundo.course.chapter3_class_practice.online_order

fun main() {
    val order1 = Order(100L, "Pending")
    val order2 = ExpressOrder(101L, "Delivered", 50.0)
    val order3 = GiftOrder(102L, "In preparation", 40.0, "Happy birthday")

    order1.displayInfo()
    order2.displayInfo()
    order3.displayInfo()
}