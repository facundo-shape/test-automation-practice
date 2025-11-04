package com.facundo.course.chapter3_class_practice.online_order

open class Order(val orderId: Long, val status: String) {
    open fun displayInfo() {
        println("Order #$orderId is in status $status")
    }
}