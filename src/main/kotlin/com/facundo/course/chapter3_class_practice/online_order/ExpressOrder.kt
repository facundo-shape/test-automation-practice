package com.facundo.course.chapter3_class_practice.online_order

open class ExpressOrder(orderId: Long, status: String, protected val expressFee: Double) : Order(orderId, status) {
    override fun displayInfo() {
        println("Order #$orderId is in status $status, with express fee of $expressFee")
    }
}