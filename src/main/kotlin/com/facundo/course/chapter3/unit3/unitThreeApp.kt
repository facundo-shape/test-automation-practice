package com.facundo.course.chapter3.unit3

import com.facundo.course.chapter3.unit3.mathops.add
import com.facundo.course.chapter3.unit3.stringops.concat

fun main() {
    val result = add(4, 5)
    println("Result: $result")

    val concatenatedString = concat("Something", "and something else")
    println(concatenatedString)
}