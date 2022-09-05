package mustDoPatterns

import simulator

fun main() {

    /**
     *  *****
     *  *****
     *  *****
     *  *****
     *  *****
     */
    /** Using repeat()
     *  Print star 5 times, and move to the next line, the previous 2 step should happen 5 times.
     *  Use 'repeat' or 'for loop', for printing contiguous stars, use println for moving to the next line.
     *  Enclose the above in another 'repeat' or 'for loop' that does this 5 times.
     */
    simulator("pattern1_using_repeat") {
        repeat(5) {
            repeat(5) {
                print("*")
            }
            println()
        }
    }

    /**
     * Using for
     */
    /**
     * for loop that prints star 5 times, after this print new line
     * use the same for loop as above, which encloses the above code, so that it repeats 5 times
     */
    simulator("using_for") {
        for (x in 0..4) {
            for (i in 0..4) {
                print("*")
            }
            println()
        }
    }

    /**
     * for each loop
     */
    simulator("using_forEach") {
        (0 until 5).forEach {
            (0 until 5).forEach {
                print("*")
            }
            println()
        }
    }

    /**
     *  *
     *  **
     *  ***
     *  ****
     *  *****
     */
    /**
     * Loop through integers 1 to 5
     * according to the integer in possession, print equivalent number of stars
     * print new line
     */
    simulator("pattern2_rt_angle_triangle") {
        for (i in 1 until 6) {
            repeat(i) {
                print("*")
            }
            println()
        }
    }

    /**
     *  1
     *  12
     *  123
     *  1234
     *  12345
     */
    simulator("pattern3_number_rt_angle_triangle") {
        for (i in 1 until 6) {
            var x = 1
            repeat(i) {
                print(x)
                ++x
            }
            println()
        }
    }

    /**
     *  1
     *  22
     *  333
     *  4444
     *  55555
     */
    simulator("pattern4") {
        for (i in 1 until 6) {
            repeat(i) {
                print(i)
            }
            println()
        }
    }

    /**
     *  *****
     *  ****
     *  ***
     *  **
     *  *
     */
    simulator("pattern5") {
        for (i in 5 downTo 1) {
            repeat(i) {
                print("*")
            }
            println()
        }
    }

    /**
     *  12345
     *  1234
     *  123
     *  12
     *  1
     */
    /**
     * After every row, move to new line
     * Should progressively reduce, start with 5 to 1
     * Maintain a variable, that increments inside the inner loop, responsible for printing the row
     */
    simulator("pattern6") {
        for (i in 5 downTo 1) {
            var x = 1
            repeat(i) {
                print(x)
                ++x
            }
            println()
        }
    }

    /**
     *       *
     *      ***
     *     *****
     *    *******
     *   *********
     */
    /**
     * Print 4 spaces & then 1 star followed by 4 spaces again
     * Print 3 spaces & then 3 stars  followed by 3 spaces again
     * Print 2 spaces & then 5 stars  followed by 2 spaces again
     * Print 1 space & then 7 stars  followed by 1 space again
     * Print 9 stars
     */
    /**
     * A loop to repeat 9 times, so that a row could be printed
     * After every row print a new line
     * loop from 4 to 0, to print 1st set of spaces, & after star, repeat the previously mentioned loop again.
     * Ta each row number starting from 0 & add to it values starting from & then increment this value by 1 at each row
     */
    simulator("pattern7") {
        var spaces = 4
        var starControl = 1
        for (i in 0..4) {
            repeat(spaces) {
                print(" ")
            }
            //star logic here
            for (x in 0 until i + starControl) {
                print("*")
            }
            --spaces
            ++starControl
            println()
        }
    }

    /**
     *   *********
     *    *******
     *     *****
     *      ***
     *       *
     */
    /**
     *  Print 9 stars
     *  Print 1 space & then 7 stars  followed by 1 space again
     *  Print 2 spaces & then 5 stars  followed by 2 spaces again
     *  Print 3 spaces & then 3 stars  followed by 3 spaces again
     *  Print 4 spaces & then 1 star followed by 4 spaces again
     */
    /**
     * Outer loop, that repeats the (inner loop + newline) 5 times, so that 5 rows are printed, index from 0..4
     * 9 columns have to be printed.
     * The number of stars drop down by 2 in each row
     */
    simulator("pattern8") {
        var stars = 9
        for (i in 0..4) {
            repeat(i) {
                print(" ")
            }
            for (i in 1..stars) {
                print("*")
            }
            stars -= 2
            println()
        }
    }

    /**
     * Translating java code to Kotlin
     * https://www.geeksforgeeks.org/java-program-to-print-reverse-pyramid-star-pattern/
     */
    val rows = 7
    simulator("Translating") {
        for (i in 7 downTo 1) {
            for (j in i..rows) {
                print(" ")
            }
            for (j in 1 until 2 * i) {
                print("*")
            }
            println()
        }
    }

    simulator("pattern8_1") {
        for (i in 5 downTo 1) {
            for (j in i..5) {
                print(" ")
            }
            for (j in 1 until (2 * i)) {
                print("*")
            }
            println()
        }
    }

    /**
     *   *
     *   **
     *   ***
     *   ****
     *   *****
     *   ****
     *   ***
     *   **
     *   *
     */
    /**
     *  outer loop, should repeat 9 times
     *  new line at the end of each row
     *  no of columns should increase by 1 at each row,
     *  once the column reaches max(5), start decrementing at each row
     */
    /**
     * repeat(9) with println at the end, within the block
     * var maxColumn = 5, var switch = false //controls whether inc or dec block is executed
     * var x = 0 // this is the variable that is inc & dec which prints the number of columns
     */
    simulator("pattern_9") {
        var x = 0
        var maxColumn = 5
        var switch = false
        repeat(9) {
            if (!switch) {
                ++x
                repeat(x){print("*")}
                if (x == maxColumn) {
                    switch = true
                }
            } else {
                --x
                repeat(x){print("*")}
            }
            println()
        }
    }


}










