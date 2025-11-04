package com.facundo.course.chapter3.shop.entities

open class Order(val orderId: Long, val status: String) {
    open fun displayInfo() {
        println("Order id is: $orderId, status is: $status ")
    }
}