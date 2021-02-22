class FirstOrNullAndLastOrNull {
    fun printSome() {
        println("firstOrNull, lastOrNull")

        val words2 = listOf("foo", "bar", "baz", "faz")
        println("list of words - " + words2)
        val empty = emptyList<String>()                        //Defines an empty collection.

        val first = empty.firstOrNull()              //Picks the first element from empty collection. It supposed to be null.
        println("first word of empty list - " + first)
        val last = empty.lastOrNull()                //Picks the last element from empty collection. It supposed to be null as well.
        println("last word of empty list - " + last)

        val firstF = words2.firstOrNull { it.startsWith('f') }  //Picks the first word starting with 'f'.
        val firstZ = words2.firstOrNull { it.startsWith('z') }  //Picks the first word starting with 'z'.
        val lastF = words2.lastOrNull { it.endsWith('f') }      //Picks the last word ending with 'f'.
        val lastZ = words2.lastOrNull { it.endsWith('z') }      //Picks the last word ending with 'z'.

        println("first word starting with 'f' from list of words - " + firstF)
        println("first word starting with 'z' from list of words - " + firstZ)
        println("last word starting with 'f' from list of words - " + lastF)
        println("last word starting with 'z' from list of words - " + lastZ)

        println()
    }
}