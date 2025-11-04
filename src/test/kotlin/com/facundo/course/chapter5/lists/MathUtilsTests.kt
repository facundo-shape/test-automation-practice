package com.facundo.course.chapter5.lists

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MathUtilsTests {
    val mathClass = MathUtils()

    @Test
    fun testAverage() {
        val numbers = listOf(1,2,3,4,5,6)
        val actualResult = mathClass.sumAllEvenNumbers(numbers)
        val expectedResult = 12

        assertEquals(expectedResult, actualResult)
    }
}