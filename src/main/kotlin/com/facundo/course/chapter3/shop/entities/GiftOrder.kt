package com.facundo.course.chapter3.shop.entities

class GiftOrder(orderId: Long, status: String, expressFee: Double, var giftMessage: String) : ExpressOrder(orderId, status, expressFee) {
    override fun displayInfo() {
        println("Order #$orderId - Status: $status - Express Fee: $expressFee - Gift Message: $giftMessage")
    }
}