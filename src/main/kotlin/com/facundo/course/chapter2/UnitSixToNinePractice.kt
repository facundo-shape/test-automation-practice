package com.facundo.course.chapter2

fun main() {
    // Function Type - Task 1
    val greeting: () -> Unit = ::greet
    println("Function Type - Task 1: ${greeting()}")

    // Function Type - Task 2
    val operation: (Int, Int) -> Int = ::multiplyTwo
    val result = operation(3,8)
    println("Function Type - Task 2: $result")

    // Function Type - Task 3
    var anotherOperation: (Int, Int) -> Int = ::multiplyTwo
    var anotherResult = anotherOperation(6, 3)
    println("Function Type - Task 3: $anotherResult")

    anotherOperation = ::subtractTwo
    anotherResult = anotherOperation(6, 3)
    println("Function Type - Task 3: $anotherResult")

    // High Order Functions - Task 1
    println("High Order Functions - Task 1: ${operate(3, 4, ::addTwo)}")
    println("High Order Functions - Task 1: ${operate(2, 5, ::subtractTwo)}")
    println("High Order Functions - Task 1: ${operate(6, 3, ::multiplyTwo)}")

    // High Order Functions - Task 2
    val selectedGreeting = chooseGreeting(false)
    print("High Order Functions - Task 2: ")
    selectedGreeting()

    // High Order Functions - Task 3
    print("High Order Functions - Task 3: ")
    repeatAction(::goodMorning)

    // Anonymous Functions - Task 1
    val sumTwo = fun(n1: Int, n2: Int): Int = n1 + n2
    println("Anonymous Functions - Task 1: ${sumTwo(7, 3)}")

    // Anonymous Functions - Task 1
    val resultOfOperation = doMath(3, 4, fun(n1: Int, n2:Int): Int = n1 * n2)
    println("Anonymous Functions - Task 2: $resultOfOperation")

    // Anonymous Functions - Task 3
    val operationFromAnonFunc = getAnonymous()
    println("Anonymous Functions - Task 3: ${operationFromAnonFunc(9, 3)}")

    // Lambda Expressions - Task 1
    print("Lambda Expressions - Task 1: ")
    val helloFromLambda = { println("Hello from Lambda!") }
    helloFromLambda()

    // Lambda Expressions - Task 2
    print("Lambda Expressions - Task 2: ")
    val stringConverter = { stringToConvert: String -> stringToConvert.uppercase() }
    println(stringConverter("kotlin"))

    // Lambda Expressions - Task 3
    val addingLambda = {n1: Int, n2: Int -> n1 + n2}
    val subtractingLambda = {n1: Int, n2: Int -> n1 - n2}
    val multiplyingLambda = {n1: Int, n2: Int -> n1 * n2}
    val resultOfSum = applyOperation(3,4, addingLambda)
    val resultOfSubtract = applyOperation(10, 5, subtractingLambda)
    val resultOfMultiply = applyOperation(2, 5, multiplyingLambda)
    println("Lambda Expressions - Task 3: adding: $resultOfSum, subtracting: $resultOfSubtract, multiplying: $resultOfMultiply")
}

// Function Type - Task 1
fun greet(): Unit = println("Hello!")

// Function Type - Task 2
fun multiplyTwo(a: Int, b: Int): Int = a * b

// Function Type - Task 3
fun subtractTwo(a: Int, b:Int): Int = a - b

// High Order Functions - Task 1
fun addTwo(a: Int, b: Int): Int = a + b
fun operate(numberOne: Int, numberTwo: Int, calculation: (Int, Int) -> Int) = calculation(numberOne, numberTwo)

// High Order Functions - Task 2
fun chooseGreeting(option: Boolean): () -> Unit = if (option) ::goodMorning else ::goodNight
fun goodMorning() = println("Good morning")
fun goodNight() = println("Good night")

// High Order Functions - Task 3
fun repeatAction(action: () -> Unit) {
    repeat(3) {
        action()
    }
}

// Anonymous Functions - Task 1
fun doMath(n1: Int, n2: Int, operation: (Int, Int) -> Int): Int = operation(n1, n2)

// Anonymous Functions - Task 3
fun getAnonymous(): (Int, Int) -> Int {
    return fun(n1: Int, n2:Int): Int = n1 - n2
}

// Lambda Expressions - Task 3
fun applyOperation(n1: Int, n2: Int, operation: (Int, Int) -> Int): Int {
    return operation(n1, n2)
}