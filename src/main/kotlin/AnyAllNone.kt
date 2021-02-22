class AnyAllNone {

    fun printSome() {

        val numbers = listOf(1, -2, 3, -4, 5, -6)      //Defines collection of numbers.
        println("any, all, none")

        val anyNegative = numbers.any { it < 0 }             //Checks if there are negative elements.
        println("negative elements in list numbers - $anyNegative")
        val anyGT6 = numbers.any { it > 6 }                  //Checks if there are elements greater than 6.
        println("greater than 6 elements in list numbers - $anyGT6")
        val allEven = numbers.all { it % 2 == 0 }            //Checks whether all elements are even.
        println("all elements are even in list numbers - $allEven")
        val allLess6 = numbers.all { it < 6 }                //Checks whether all elements are less than 6.
        println("all elements are less than 6 in list numbers - $allLess6")
        val allOdd = numbers.none { it % 2 == 0 }           //Checks if there are no even elements (all elements are odd).
        println("all elements are odd in list numbers - $allOdd")
        val allLess5 = numbers.none { it > 5 }               //Checks if there are no elements greater than 5.
        println("all elements are less than 5 in list numbers - $allLess5")

        println()

    }

}