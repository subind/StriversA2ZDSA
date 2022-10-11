package sortingTechniques.sorting1

import simulator

fun main() {

    /**
     * A temp variable to store the lowest value encountered in every iteration.
     * And this value is stored in the left most(lowest) index & the value at this location is swapped with location where the current lowest value was found.
     * At each iteration the left most index where the lowest value of each iteration to be swapped to is incremented by 1 to the right.
     * The process of sorting is over when this position reaches the (length of array - 1)
     */
    /**
     * Outer loop to navigate from the current left-most position (LMP) to the next.
     * Inner loop that starts from the current LMP to the end, where the lowest encountered element in this range is stored in 'temp' variable.
     * At the end of this inner loop: increment LMP by +1, swap LMP value & temp value at their respective position's.
     */
    simulator("Brute force sort") {
        val unSortedList = mutableListOf(13, 46, 24, 52, 20, 9)

        var lowestValueTemp = 0
        var lowestValueP = 0
        var leftMostP = 0
        unSortedList.forEach {
            lowestValueTemp = unSortedList[leftMostP]
            for (i in leftMostP until unSortedList.size) {
                if (unSortedList[i] < lowestValueTemp) {
                    lowestValueTemp = unSortedList[i]
                    lowestValueP = i
                }
            }
            val leftMostPValue = unSortedList[leftMostP]
            unSortedList[leftMostP] = unSortedList[lowestValueP]
            unSortedList[lowestValueP] = leftMostPValue
            leftMostP++
            lowestValueTemp = 0
        }
        println(unSortedList)
    }

    simulator("Brute force sort approach 2") {
        val unSortedList = mutableListOf(13, 46, 24, 52, 20, 9)

        var tempLowestValue = 0
        var tempLowestValuePos = 0
        unSortedList.forEachIndexed { pointerIndex, pointerValue ->
            tempLowestValue = pointerValue
            for (i in pointerIndex until unSortedList.size) {
                if (unSortedList[i] < tempLowestValue) {
                    tempLowestValue = unSortedList[i]
                    tempLowestValuePos = i
                }
            }
            unSortedList[tempLowestValuePos] = pointerValue
            unSortedList[pointerIndex] = tempLowestValue
        }
        println(unSortedList)
    }

}