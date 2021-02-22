class FilterFunction {

    fun printSomeFilters() {
        println("filter function")
        val numbers = listOf(1, -2, 3, -4, 5, -6)      //Defines collection of numbers.
        println(numbers)
        val positives = numbers.filter { x -> x > 0 }  //Gets positive numbers.
        print("only positives: ")
        println(positives)
        val negatives = numbers.filter { it < 0 }      //Uses the shorter it notation to get negative numbers.
        print("only negatives: ")
        println(negatives)

        println()
    }
}