class CountFunction {

    fun printSome() {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val totalCount = numbers.count()                     //Counts the total number of elements.
        val evenCount = numbers.count { it % 2 == 0 }        //Counts the number of even elements.

        println("Total number of elements: $totalCount")
        println("Number of even elements: $evenCount")
    }

}