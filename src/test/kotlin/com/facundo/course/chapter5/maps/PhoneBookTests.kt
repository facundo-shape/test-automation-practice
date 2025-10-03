package com.facundo.course.chapter5.maps

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class PhoneBookTests {
    private val phoneBook = PhoneBook()

    @Test
    fun testAddContact() {
        val name = "Sally"
        val phoneNumber = 123456
        phoneBook.addContact(name, phoneNumber)
        assertEquals(phoneNumber, phoneBook.getContact(name))
    }

    @Test
    fun testGetNonExistentContact() {
        assertNull(phoneBook.getContact("John"))
    }
}