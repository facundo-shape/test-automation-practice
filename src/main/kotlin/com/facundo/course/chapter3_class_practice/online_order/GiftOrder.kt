package com.facundo.course.chapter3_class_practice.online_order

class GiftOrder(
    orderId: Long,
    status: String,
    expressFee: Double,
    val giftMessage: String
) : ExpressOrder(orderId, status, expressFee) {
    override fun displayInfo() {
        println("Order #$orderId is in status $status with express fee of $expressFee and gift message $giftMessage")
    }
}