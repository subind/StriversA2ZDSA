package basicMath

import simulator

fun main() {

    simulator("Count digits in a number solution 1") {
        val inputString = "12345"
        println(inputString.length)
    }

    simulator("Count digits in a number solution 2") {
        val inputString = "12345"
        println(inputString.toCharArray().distinct().count())
    }

    simulator("Count digits in a number solution 3") {
        var x: Int = 12345
        var counter = 0
        while(x != 0) {
            x = x / 10
            ++counter
            println("count is $counter, value of x is $x")
        }
    }


}