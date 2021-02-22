class FirstLast {
    fun printSome() {

        val numbers = listOf(1, -2, 3, -4, 5, -6)      //Defines collection of numbers.
        println("first, last")
        println("numbers list - " + numbers)
        val firstNumber = numbers.first()                          //Picks the first element.
        println("first element of numbers list - " + firstNumber)
        val lastNumber = numbers.last()                            //Picks the last element.
        println("last element of numbers list - " + lastNumber)
        val firstEven = numbers.first { it % 2 == 0 }        //Picks the first even element.
        println("first even element of numbers list - " + firstEven)
        val lastOdd = numbers.last { it % 2 != 0 }           //Picks the last odd element.
        println("last odd element of numbers list - " + lastOdd)

        println()
    }
}