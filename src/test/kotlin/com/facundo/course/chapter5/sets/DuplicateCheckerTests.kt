package com.facundo.course.chapter5.sets

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DuplicateCheckerTests {
    val duplicateChecker = DuplicateChecker()
    val numberToCheck = 3

    @Test
    fun testDuplicateCheckerWithList() {
        val numbersList = listOf(3,7,4,3,1,4,2,4,8)
        assertTrue(duplicateChecker.isNumberInSet(numbersList, numberToCheck))
    }

    @Test
    fun testDuplicateCheckerWithSet() {
        val numbersSet = setOf(3,7,4,3,1,4,2,4,8)
        assertTrue(duplicateChecker.isNumberInSet(numbersSet, numberToCheck))
    }

    @Test
    fun testNumberNotInSet() {
        val numbersList = listOf(1,2,4)
        assertFalse(duplicateChecker.isNumberInSet(numbersList, numberToCheck))
    }
}