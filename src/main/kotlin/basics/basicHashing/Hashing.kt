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
    simulator("Counting frequencies of array elements") {
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
}