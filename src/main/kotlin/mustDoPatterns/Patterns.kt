package mustDoPatterns

class Patterns {

    fun starSquare() {
        for (x in 1..5) {
            for (i in 1..5) {
                print("* ")
            }
            println()
        }
    }

    fun starRightAngledTriangle() {
        /*for (i in 1..5) {
            repeat(i) {
                print("* ")
            }
            println()
        }*/
        for (i in 1..5) {
            for(x in 0 until i) {
                print("* ")
            }
            println()
        }
    }

}