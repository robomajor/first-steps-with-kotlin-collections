class GetOrElseFunction {
    fun printSome() {
        val list = listOf(0, 10, 20)
        println(list.getOrElse(1) { 42 })    //Prints the element at the index 1.
        println(list.getOrElse(10) { 42 })   //Prints 42 because the index 10 is out of bounds.

        val map = mutableMapOf<String, Int?>()
        println(map.getOrElse("x") { 1 })       //Prints the default value because the key "x" is not in the map.

        map["x"] = 3
        println(map.getOrElse("x") { 1 })       //Prints 3, the value for the key "x".

        map["x"] = null
        println(map.getOrElse("x") { 1 })       //Prints the default value because the value for the key "x" is not defined.
        println()
    }
}