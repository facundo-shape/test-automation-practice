package com.facundo.course.chapter3.shop.entities

open class ExpressOrder(orderId: Long, status: String, protected var expressFee: Double) : Order(orderId, status) {
    override fun displayInfo() {
        println("Order #$orderId - Status: $status - Express Fee: $expressFee")
    }
}