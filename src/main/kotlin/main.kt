fun main() {

    val aboutList = AboutList()

    aboutList.addSudoer(4)            //Updates the MutableList. All related read-only views are updated as well
    // since they point to the same object.
    println("Tot sudoers: ${aboutList.getSysSudoers().size}")               //Retrieves the size of the read-only list.
    aboutList.getSysSudoers().forEach {                                     //Iterates the list and prints its elements.
            i ->
        println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!           //Attempting to write to the read-only view causes a compilation error.


    val aboutSet = AboutSet()

    val aNewIssue = "uniqueDescr4"
    val anIssueAlreadyIn = "uniqueDescr2"

    println("Issue $aNewIssue ${aboutSet.getStatusLog(aboutSet.addIssue(aNewIssue))}")
    //Prints a success message: the new element is added to the Set.

    println("Issue $anIssueAlreadyIn ${aboutSet.getStatusLog(aboutSet.addIssue(anIssueAlreadyIn))}")
    //Prints a failure message: the element can't be added because it duplicates an existing element.

    println(aboutSet.getIssuesSet())

    println()

    val aboutMap = AboutMap()

    aboutMap.accountsReport()                   //Reads the account points balance, before updates.
    aboutMap.updatePointsCredit(1)     //Updates an existing account two times.
    aboutMap.updatePointsCredit(1)
    aboutMap.updatePointsCredit(5)     //Tries to update a non-existing account: prints an error message.
    aboutMap.accountsReport()                   //Reads the account points balance, after updates.

    println()

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

    println("map extension function")
    val doubled = numbers.map { x -> x * 2 }      //Doubles numbers.
    print("numbers doubled: ")
    println(doubled)
    val tripled = numbers.map { it * 3 }          //Uses the shorter it notation to triple the numbers.
    print("numbers tripled: ")
    println(tripled)

    println()

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

    println("find, findLast")
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  //Defines a collection of words.
    println("list of words - " + words)
    val first = words.find { it.startsWith("some") }                   //Looks for the first word starting with "some".
    println("first word starting with \"some\" - " + first)
    val last = words.findLast { it.startsWith("some") }                //Looks for the last word starting with "some".
    println("last word starting with \"some\" - " + last)
    val nothing = words.find { it.contains("nothing") }                //Looks for the first word containing "nothing".
    println("first word containing \"nothing\" - " + nothing)

    println()

    println("first, last")

}