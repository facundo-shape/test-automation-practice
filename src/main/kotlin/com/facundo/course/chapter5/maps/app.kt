package com.facundo.course.chapter5.maps

fun main() {
    val frequencyCounter = FrequencyCounter()
    val listOfWords = listOf("Facu", "Facu", "So", "Coso", "Cososo", "Coso")
    println(frequencyCounter.countWordFrequency(listOfWords))
}