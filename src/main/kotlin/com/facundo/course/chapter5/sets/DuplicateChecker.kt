package com.facundo.course.chapter5.sets

class DuplicateChecker {
    fun isNumberInSet(collection: Collection<Int>, numberToCheck: Int): Boolean {
        return collection.contains(numberToCheck)
    }
}