package basicMath

import simulator
import kotlin.math.min

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
            output *= 10
            output += temp
        }

        println(output)
    }

    /**
     * Check Palindrome
     * Approach 1
     */
    simulator("Check Palindrome") {
        val input = "123"
        var temp = ""

        for (i in input.length - 1 downTo 0) {
            temp += input.toCharArray()[i]
        }
        if (temp == input) {
            println("The input: $input is Palindrome")
        } else {
            println("The input: $input is not Palindrome")
        }
    }

    /**
     * Check Palindrome
     * Approach 2
     */
    simulator("Check Palindrome - Approach 2") {
        var initialInput = 123
        var input = initialInput
        var final = 0

        while(input > 0) {
            var digit = input % 10
            final = final*10 + digit
            input /= 10
        }
        if (final == initialInput) {
            println("The input: $initialInput is Palindrome")
        } else {
            println("The input: $initialInput is not Palindrome")
        }
    }

    /**
     * Armstrong numbers
     */
    simulator("Armstrong numbers") {
        var initialInput = 1634
        var input = initialInput
        var final = 0
        var dummyInput = input
        var size = 0

        while(dummyInput > 0) {
            size++
            dummyInput /= 10
        }

        while (input > 0) {
            var digit = (input % 10) * size
            final += digit
            input /= 10
        }

        if(initialInput == final){
            println("Armstrong numbers")
        }else {
            println("Not Armstrong numbers")
        }
    }

    /**
     * GCD of two numbers
     */
    /**
     * Steps :-
     * Infinite while loop
     * gcdCandidate starts with 2 that increments after every loop, this is the variable that performs modulo on these 2 numbers
     * if result is not gcd of both, increment the gcdCandidate by 1, else
     * break out of the loop
     * and print the gcdCandidate
     *
     */
    simulator("GCD of 2 numbers, approach 1") {
        val num1 = 4
        val num2 = 8
        var gcdCandidate = 2
        var temp = ""

        while (true) {
            if (num1 % gcdCandidate == 0 && num2 % gcdCandidate == 0) {
                temp = gcdCandidate.toString()
            }
            if (gcdCandidate >= num1 || gcdCandidate >= num2) {
                break
            }
            gcdCandidate++
        }
        println(temp)
    }

    simulator("GCD of 2 numbers, approach 2") {
        val num1 = 7
        val num2 = 8
        var gcd = "notFound"
        for (i in 2..min(num1, num2)) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i.toString()
            }
        }
        println(gcd)
    }


}