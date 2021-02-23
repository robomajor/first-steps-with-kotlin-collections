import kotlin.math.abs

class SortedFunction {
    fun printSome() {
        val shuffled = listOf(5, 4, 2, 1, 3, -10)                   //Defines a collection of shuffled numbers.
        val natural = shuffled.sorted()                             //Sorts it in the natural order.
        val inverted = shuffled.sortedBy { -it }                    //Sorts it in the inverted natural order by using -it as a selector function.
        val descending = shuffled.sortedDescending()                //Sorts it in the inverted natural order by using sortedDescending.
        val descendingBy = shuffled.sortedByDescending { abs(it)  } //Sorts it in the inverted natural order of items' absolute values by using abs(it) as a selector function.

        println()
        println("Shuffled: $shuffled")
        println("Natural order: $natural")
        println("Inverted natural order: $inverted")
        println("Inverted natural order value: $descending")
        println("Inverted natural order of absolute values: $descendingBy")
        println()
    }
}