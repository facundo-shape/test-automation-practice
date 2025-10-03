package com.facundo.course.chapter5.sets

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NameCollectorTests {
    val nameCollector = NameCollector()

    @Test
    fun testUniqueNames() {
        val namesList = listOf("Fie", "Jeremy", "Søren", "Cristian", "Kathrin", "Kathrin", "Søren")
        val expectedNamesList = listOf("Fie", "Jeremy", "Søren", "Cristian", "Kathrin")
        val actualNamesList = nameCollector.uniqueNames(namesList).toList()

        assertEquals(expectedNamesList, actualNamesList)
    }
}