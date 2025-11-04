package com.facundo.course.chapter5.lists

class MathUtils() {
    fun sumAllEvenNumbers(numbers: List<Int>): Int {
        var sum: Int = 0
        numbers.forEach { it -> if(it % 2 == 0) sum+=it }
        return sum
    }
}