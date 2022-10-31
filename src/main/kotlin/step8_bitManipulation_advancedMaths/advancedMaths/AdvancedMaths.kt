fun main() {

    /**
     * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
     */
    /**
     * Input is 15
     * So we have a list of integers from 2 to 15
     * Maintain an indexPos variable & start with 0
     * Use the element at this index & modulo every element in the list. Removes the elements that produced remainder 0
     * Increment indexPos by 1, & repeat the last step
     * Stop the outer loop when indexPos >= sizeOfTheArray
     */
    simulator("Sieve of Eratosthenes") {
        var indexPos = 0
        var myArray = (2..100).toMutableList()
        var myArrayIterator: MutableIterator<Int>? = null

        while (indexPos < myArray.size) {
            myArrayIterator = myArray.iterator()
            while(myArrayIterator.hasNext()) {
                val currentValue = myArrayIterator.next()
                if((currentValue != myArray[indexPos]) && (currentValue % myArray[indexPos] == 0)) {
                    myArrayIterator.remove()
                }
            }
            indexPos++
            myArrayIterator = null
        }

        println(myArray)
    }




}