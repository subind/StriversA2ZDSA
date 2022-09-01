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
    simulator("using_repeat") {
        repeat(5){
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
        for(x in 0..4) {
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


}