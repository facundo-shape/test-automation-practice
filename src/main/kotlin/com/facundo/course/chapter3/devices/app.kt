package com.facundo.course.chapter3.devices

import com.facundo.course.chapter3.devices.entities.Device
import com.facundo.course.chapter3.devices.entities.SmartLamp

/**
 * Task 1: Smart Devices
 * Imagine you are designing software for smart home devices.
 *
 * There is a basic class Device with properties like name and a function turnOn() that prints a simple message.
 * You need to make a class SmartLamp that comes from Device and adds a property for brightness.
 * Override the turnOn() function in SmartLamp so it prints a message including the lamp’s name and brightness.
 * Extra:
 * Add a getter for the brightness property so that if the brightness is less than 10, it always returns 10.
 */

fun main() {
    val device = Device("Generic chinese thing that you bought for cheap")
    device.turnOn()
    val lampOne = SmartLamp("Living room", 8)
    lampOne.turnOn()

}