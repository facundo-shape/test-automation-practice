package com.facundo.course.chapter3.devices.entities

class SmartLamp(name: String, _brightness: Int) : Device(name) {
    var brightness: Int = _brightness
        get() {
        if (field < 10)
            return 10
                else return field
        }

    override fun turnOn() {
        println("The device $name is turned on now, with a brightness level of $brightness")
    }
}