class MapExtensionFunction {

    fun printSome() {

        val numbers = listOf(1, -2, 3, -4, 5, -6)      //Defines collection of numbers.
        println("map extension function")
        val doubled = numbers.map { x -> x * 2 }      //Doubles numbers.
        print("numbers doubled: ")
        println(doubled)
        val tripled = numbers.map { it * 3 }          //Uses the shorter it notation to triple the numbers.
        print("numbers tripled: ")
        println(tripled)

        println()
    }

}