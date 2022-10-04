package basicRecursion

import simulator

fun main() {

    /**
     * Understand recursion by printing something N times
     */
    /**
     * A function which calls itself, but has a base condition within which stops itself at some point.
     * fun name 'recursiveFun', input integer 'n' which is the number of times it should print,
     *
     */
    simulator("Understand recursion by print something N times") {
        val input = 5
        val temp = 1
        recursiveFunction(input, temp)
    }


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