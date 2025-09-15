package com.facundo.course.chapter3.shop

import com.facundo.course.chapter3.shop.entities.ExpressOrder
import com.facundo.course.chapter3.shop.entities.GiftOrder
import com.facundo.course.chapter3.shop.entities.Order

fun main() {
    val order = Order(1001L, "PENDING")
    val express = ExpressOrder(1002L, "SHIPPED", 4.6)
    val gift = GiftOrder(1003L, "DELIVERED", 5.8, "Happy birthday!")

    order.displayInfo()
    express.displayInfo()
    gift.displayInfo()
}