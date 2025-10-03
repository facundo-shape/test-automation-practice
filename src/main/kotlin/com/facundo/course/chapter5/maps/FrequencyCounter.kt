package com.facundo.course.chapter5.maps

class FrequencyCounter {
    fun countWordFrequency(words: List<String>): Map<String, Int> {
        val wordsFrequencyMap = mutableMapOf<String, Int>()
        val setOfWords = words.toSet()
        setOfWords.forEach { word ->
            val frequency = words.count {word == it}
            wordsFrequencyMap[word] = frequency
        }
        return wordsFrequencyMap
    }
}