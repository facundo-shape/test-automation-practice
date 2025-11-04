package com.facundo.course.chapter3.devices.entities

open class Device(var name: String) {
    open fun turnOn(){
        println("The device $name is turned on now!")
    }
}