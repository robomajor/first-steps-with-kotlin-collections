class FindAndFindLast {

    fun printSome() {
        println("find, findLast")
        val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  //Defines a collection of words.
        println("list of words - " + words)
        val firstWord =
            words.find { it.startsWith("some") }                   //Looks for the first word starting with "some".
        println("first word starting with \"some\" - " + firstWord)
        val lastWord =
            words.findLast { it.startsWith("some") }                //Looks for the last word starting with "some".
        println("last word starting with \"some\" - " + lastWord)
        val nothing = words.find { it.contains("nothing") }                //Looks for the first word containing "nothing".
        println("first word containing \"nothing\" - " + nothing)

        println()
    }

}