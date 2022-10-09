package basics.basicHashing

import simulator

fun main() {

    /**
     * input array to be operated upon {10,5,10,15,10,5}
     * initialise a hashmap<Int, Int>.
     * maintain a variable that increments if it encounters the same element
     * sort the array
     * loop through the array until its length
     * If any element is not present in hashmap, reset count value to 1
     */
    simulator("Counting frequencies of array elements: Approach1: Hashmap") {
        val myArray = mutableListOf(10, 5, 10, 15, 10, 5)
        val myHashMap = mutableMapOf<Int, Int>()
        var counter = 0
        myArray.sorted()
            .forEach {
                if (!myHashMap.containsKey(it)) {
                    counter = 0
                }
                myHashMap[it] = ++counter
            }
        myHashMap.forEach {
            println("The element ${it.key} is repeated ${it.value} times")
        }
    }

    //5, 5, 10, 10, 10, 15
    /**
     * Sort the array
     * Outer loop to pick an element
     * Inner loop to move from the element under observations position to its right, update counter variable if encountered same item
     * break out of inner loop if encountered different element than 'element under observation'
     * While breaking out of the loop store the index value in x, on where the loop was broken, in-order to progress to the next unique element.
     * In the outer loop have a condition that checks if i is less than x, if so 'continue' & also set x to null
     * In inner loop if the current index is length of string, print the element & its occurrence
     */
    /**
     * Sort array.
     * Outer loop to get hold of an unique element, say 'oV'
     * Inner loop, to find no: of occurrences of the element under observation, i.e, 'oV'
     * So within inner loop if 'oV' == 'iV', increment the counter by 1, else if(oI == size) print value & occurrence, else
     * store 'iI' in x & also print oI & counter value.
     * Have an if statement within outer loop, if(x != null & oI < x) {continue} else { x = null }
     *
     */
    simulator("Counting frequencies of array elements: Approach2: Using 2 loops") {
        var myArray = mutableListOf(10, 5, 10, 15, 10, 5)
        myArray = myArray.sorted().toMutableList()
        var occurrence = 0
        var nextUniqueElementPos: Int? = null
        //5, 5, 10, 10, 10, 15
        myArray.forEachIndexed { oI, oV ->
            if (nextUniqueElementPos != null && oI < nextUniqueElementPos!!) {
                return@forEachIndexed
            }
            run breaking2@{
                myArray.forEachIndexed { iI, iV ->
                    if (nextUniqueElementPos != null && iI < nextUniqueElementPos!!) {
                        return@forEachIndexed
                    } else {
                        nextUniqueElementPos = null
                    }
                    if (oV == iV) {
                        ++occurrence
                        if (oI == myArray.size - 1) {
                            println("Value $oV is repeated $occurrence times")
                        }
                    } else if (oI == myArray.size - 1) {
                        println("Value $oV is repeated 1 time")
                    } else {
                        nextUniqueElementPos = iI
                        println("Value $oV is repeated $occurrence time's")
                        occurrence = 0
                        return@breaking2
                    }
                }
            }
        }

    }

    simulator("Counting frequencies of array elements: Approach3: Using 2 loops, with an array to maintain visited elements") {
        var myArray = mutableListOf(10, 5, 10, 15, 10, 5)
        myArray = myArray.sorted().toMutableList() //5, 5, 10, 10, 10, 15
        var visitedElements = mutableListOf<Int>()
        var counter = 0
        var tempOldElementUnderProcess: Int? = null
        myArray.forEachIndexed { elementUnderProcessIndex, elementUnderProcess ->
            if(tempOldElementUnderProcess!=null && elementUnderProcess != tempOldElementUnderProcess) {
                println("Value $tempOldElementUnderProcess is repeated $counter time's")
                counter = 0
                if(elementUnderProcessIndex == myArray.size-1) {
                    println("Value $elementUnderProcess is repeated 1 time")
                }
            } else if(elementUnderProcessIndex == myArray.size-1) {
                println("Value $tempOldElementUnderProcess is repeated $counter time's")
            }
            tempOldElementUnderProcess = elementUnderProcess
            if (!visitedElements.contains(elementUnderProcess)) {
                visitedElements.add(elementUnderProcess)
                myArray.forEach { innerLoopValue ->
                    if (innerLoopValue == elementUnderProcess) {
                        ++counter
                    }
                }
            }
        }
    }

    /**
     * simulator("Counting frequencies of array elements: Approach3: Using 2 loops") {
    var myArray = mutableListOf(10, 5, 10, 15, 10, 5)
    myArray = myArray.sorted().toMutableList() //5, 5, 10, 10, 10, 15
    var visitedElements = mutableListOf<Int>()
    var counter = 0
    myArray.forEach { elementUnderProcess ->
    if (!visitedElements.contains(elementUnderProcess)) {
    visitedElements.add(elementUnderProcess)
    myArray.forEach { innerLoopValue ->
    if (innerLoopValue == elementUnderProcess) {
    ++counter
    }
    }
    }
    }
    }
     */

}