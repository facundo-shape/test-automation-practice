package com.facundo.course.chapter3.unit5

class Recipe {
    private val ingredients = listOf("Eggs", "Salt")

    var name: String = ""

    fun printIngredients() {
        for (item in ingredients) println(item)
    }
}