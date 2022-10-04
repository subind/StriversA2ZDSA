package basicRecursion

import simulator

fun main() {

    /**
     * Understand recursion by printing something N times
     */
    simulator("Understand recursion by print something N times") {
        val input = 5
        val temp = 1
        recursiveFunction(input, temp)
    }

    /**
     * Print 1 to n using recursion
     */
    simulator("Print 1 to n using recursion") {
        val n = 10
        val controller = 1
        oneToNRecursively(n, controller)

    }

    /**
     * Sum of first N numbers
     */
    simulator("Sum of first N numbers") {
        sumOfFirstNNumbers(5, 0, 0)
    }

    /**
     * Factorial of N numbers
     */
    simulator("Factorial of N numbers") {
        factorialOfN(5, 1)
    }

}

fun factorialOfN(n: Int, presentValue: Int) {
    var n = n
    var presentValue = presentValue
    if(n < 1){
        println(presentValue)
        return
    }
    presentValue *= n
    --n
    factorialOfN(n, presentValue)
}

fun sumOfFirstNNumbers(n: Int, presentSum: Int, tempController: Int) {
    var presentSum = presentSum
    var tempController = tempController

    ++tempController
    if(tempController > n) {
        println(presentSum)
        return
    }
    presentSum += tempController
    sumOfFirstNNumbers(n, presentSum, tempController)
}

fun oneToNRecursively(n: Int, controller: Int) {
    var controller = controller
    if(controller > n) {
        return
    }
    println(controller)
    ++controller
    oneToNRecursively(n, controller)
}

fun recursiveFunction(input: Int, temp: Int) {
    var tempX = temp
    if(tempX > input) {
        return
    }
    println("Hi")
    ++tempX
    recursiveFunction(input, tempX)
}