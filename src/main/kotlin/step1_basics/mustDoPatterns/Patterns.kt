package step1_basics.mustDoPatterns

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
                repeat(x) { print("*") }
                if (x == maxColumn) {
                    switch = true
                }
            } else {
                --x
                repeat(x) { print("*") }
            }
            println()
        }
    }

    /**
     *  1
     *  0 1
     *  1 0 1
     *  0 1 0 1
     *  1 0 1 0 1
     */
    simulator("pattern_11") {
        val rowinput = 5
        var binarySwitch: Boolean = true
        for (i in 1..rowinput) {
            binarySwitch = i % 2 == 0
            repeat(i) {
                if (!binarySwitch) print("1 ") else print("0 ")
                binarySwitch = !binarySwitch
            }
            println()
        }
    }

    /**
     *   1      1 - 6
     *   12    21 - 4
     *   123  321 - 2
     *   12344321 - 0     (8 columns)
     */
    /**
     *   1        1 - 8
     *   12      21 - 6
     *   123    321 - 4
     *   1234  4321 - 2
     *   1234554321 - 0   (10 columns)
     */
    /**
     * inputRows = 5
     * columns = inputRows * 2
     * acc to row number, print numbers upto that number
     * hold these contiguous numbers as a string, so that it can be reversed after printing the spaces
     * space's = columns - 2, & this value decrements by 2 at each row
     */
    /**
     * outer for loop, to print multiple rows
     * inner loop upto column length
     * store into string values from 1 to i(outer loop index)
     * print spaces a per logic
     */
    simulator("pattern_12") {
        var inputRows = 5
        var columns = inputRows * 2
        var myStr: String = ""
        var maxSpaces = columns - 2
        var spaceProgress = 1
        for (i in 1..inputRows) {
            for (x in 1..columns) {
                if (x <= i) {
                    print(x)
                    myStr += x.toString()
                }
                if ((x > i) && spaceProgress <= maxSpaces) {
                    ++spaceProgress
                    print(" ")
                }
                if (x > myStr.length + maxSpaces) {
                    print(myStr.reversed())
                    break
                }
            }
            spaceProgress = 1
            myStr = ""
            maxSpaces -= 2
            println()
        }
    }

    /**
     *  1
     *  2 3
     *  4 5 6
     *  7 8 9 10
     *  11 12 13 14 15
     */
    /**
     * inputRow = 5
     * number of values = number of rows
     */
    simulator("pattern_13") {
        var x = 1
        for (i in 1..5) {
            for (i in 1..i) {
                print("$x ")
                ++x
            }
            println()
        }
    }

    /**
     *  A
     *  AB
     *  ABC
     *  ABCD
     *  ABCDE
     */
    simulator("pattern_14") {
        var myArray = arrayOf("A", "B", "C", "D", "E")
        for (i in 0 until 5) {
            for (k in 0..i) {
                print(myArray[k])
            }
            println()
        }
    }

    /**         space   letter
     *     A    - 3       1
     *    ABA   - 2       3
     *   ABCBA  - 1       5
     *  ABCDCBA - 0       7
     */
    simulator("pattern_15") {
        val myArray = arrayOf("A", "B", "C", "D")
        var space = 3
        var myStr = ""
        for (i in 1..4) {
            for (j in 1..space) {
                print(" ")
            }
            for (k in 1..i) {
                myStr += myArray[k - 1]
            }
            if (myStr.length > 1) {
                myStr += myStr.reversed().subSequence(1, myStr.length)
                print(myStr)
            } else {
                print(myStr)
            }
            myStr = ""
            --space
            println()
        }
    }

    /**
     *   E
     *   D E
     *   C D E
     *   B C D E
     *   A B C D E
     */
    /**
     *  letter E ascii characters 69
     */
    var myStr = ""
    var charAscii = 69 // E
    simulator("pattern_16") {
        for (i in 1..5) {
            for (k in 1..i) {
                myStr += charAscii.toChar().toString().replace("", " ")
                --charAscii
            }
            print(myStr.reversed())
            myStr = ""
            charAscii = 69
            println()
        }
    }

    /**
     *   **********
     *   ****  ****       //2
     *   ***    ***       //4
     *   **      **       //6
     *   *        *       //8
     *   *        *       //8
     *   **      **       //6
     *   ***    ***       //4
     *   ****  ****       //2
     *   **********
     */

    /**
     *0   **********    //RE-reminderExist, NR-NoReminder
     *2   ****  ****    //10/2 NR= 5th pos space start
     *4   ***    ***    //10/3 RE= 3rd pos + 1
     *6   **      **    //10/4 RE= 2nd pos + 1
     *8   *        *    //10/5 NR= 2nd pod
     */
    /**
     *
     */
    simulator("pattern_17.1") {
        var spaceCountLimit = 0
        var spaceCountController = 1
        for (i in 1..5) {
            for (k in 1..10) {
                if (k >= spaceStartPos(i) && (spaceCountController <= spaceCountLimit)) {
                    print(" ")
                    ++spaceCountController
                } else {
                    print("*")
                }
            }
            spaceCountLimit += 2
            spaceCountController = 1
            println()
        }
    }
}

// for pattern_17.1
fun spaceStartPos(i: Int): Int {
    var isRemainderZero: Boolean = 10 % i == 0
    val adjustment = if (isRemainderZero) {
        0
    } else {
        1
    }
    return (10 / i) + adjustment
}



/*
simulator("") {
    var spaceCount = 0
    for (i in 1..5) {
        for (k in 1..10) {
            if (spaceStartPos(i) == i && ()) {
                print(" ")
            } else {
                print("*")
            }
        }
        ++spaceCount
    }
}
*/












