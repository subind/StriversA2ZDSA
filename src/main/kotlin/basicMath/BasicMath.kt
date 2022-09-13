package basicMath

import simulator

fun main() {

    /**
     * Count digits
     */
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
        while (x != 0) {
            x = x / 10
            ++counter
            println("count is $counter, value of x is $x")
        }
    }

    /**
     * Reverse a number
     */
    /**
     *  given input integer
     *  using modulo operator % with 10 we can get the right most integer
     *  using divide operator / with 10 we can exclude the right most integer & get the rest to its left
     *  the entire process should take place inside the while loop, as long as the integer getting reduced by division with 10 is greater than 0
     *  the right most integer should be stored in a temporary variable, & at each step
     *  this mentioned temporary variable must be multiplied with 10 before adding the new right most variable which is the latest result of modulo 10 operation
     *  for the above step, if the temp is greater than 1, multiply it with 10, else skip the multiplication step
     */
    simulator("Reverse a number solution 1") {
        var input = 123456789
        var temp = 0
        var output = 0

        while (input > 0) {
            temp = input % 10
            input /= 10
            if(output > 0){
                output *= 10
            }
            output += temp
        }

        println(output)
    }


}