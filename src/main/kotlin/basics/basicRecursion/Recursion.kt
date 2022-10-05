package basics.basicRecursion

import simulator

fun main() {

    simulator("Understand recursion by print something N times") {
        val input = 5
        val temp = 1
        recursiveFunction(input, temp)
    }

    simulator("Print 1 to n using recursion") {
        val n = 10
        val controller = 1
        oneToNRecursively(n, controller)

    }

    simulator("Sum of first N numbers") {
        sumOfFirstNNumbers(5, 0, 0)
    }

    simulator("Factorial of N numbers") {
        factorialOfN(5, 1)
    }

    simulator("Reverse an array") {
        var myArray = mutableListOf(5,4,3,2,1)
        reverseAnArray(myArray, 0, myArray.size-1)
    }

    simulator("String is palindrome or not") {
        val inputString = "ABCDCBA"
        val tempString = StringBuilder(inputString)
        palindromeOrNot(inputString, tempString, 0, inputString.length-1)
    }

}

fun palindromeOrNot(orgString: String, tempString: java.lang.StringBuilder, startIndex: Int, endIndex: Int) {
    if(startIndex >= endIndex) { //BaseCondition
        if(orgString == tempString.toString()) {
            println("$orgString is a palindrome")
        } else {
            println("$orgString is not a palindrome")
        }
        return
    }
    val temp = tempString[endIndex]
    tempString[endIndex] = tempString[startIndex]
    tempString[startIndex] = temp
    palindromeOrNot(orgString, tempString, startIndex+1, endIndex-1)
}

fun reverseAnArray(myArray: MutableList<Int>, startIndex: Int, endIndex: Int) {
    var startIndex = startIndex
    var endIndex = endIndex
    if(startIndex >= endIndex) { //Base condition
        println(myArray)
        return
    }
    val temp = myArray[endIndex]
    myArray[endIndex] = myArray[startIndex]
    myArray[startIndex] = temp
    reverseAnArray(myArray, ++startIndex, --endIndex)
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