package com.facundo.course.chapter5.maps

class PhoneBook {
    private val phoneBook = mutableMapOf<String, Int>()

    fun addContact(name: String, phoneNumber: Int) {
        phoneBook[name] = phoneNumber
    }

    fun getContact(name: String): Int? {
        return if (phoneBook.contains(name)) phoneBook[name] else null
    }
}