class ZipFunction {
    fun printSome() {
        val A = listOf("a", "b", "c")                  //Defines two collections.
        val B = listOf(1, 2, 3, 4)                     //

        val resultPairs = A zip B                      //Merges them into a list of pairs. The infix notation is used here.
        val resultReduce = A.zip(B) { a, b -> "$a$b" } //Merges them into a list of String values by the given transformation.

        println("A to B: $resultPairs")
        println("\$A\$B: $resultReduce")
        println()
    }
}