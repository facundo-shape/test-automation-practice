package com.facundo.course.chapter5.lists

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StudentTests {
    val student = Student("TestStudent", listOf(1,2,3,4,5,6))

    @Test
    fun averageGradeTest() {
        val expectedResult = student.averageGrades()
        val actualResult = 3.5

        assertEquals(expectedResult, actualResult)
    }
}