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

    val filterFunction = FilterFunction()
    filterFunction.printSomeFilters()

    val mapExtensionFunction = MapExtensionFunction()
    mapExtensionFunction.printSome()

    val anyAllNone = AnyAllNone()
    anyAllNone.printSome()

    val findAndFindLast = FindAndFindLast()
    findAndFindLast.printSome()

    val firstLast = FirstLast()
    firstLast.printSome()

    val firstOrNullAndLastOrNull = FirstOrNullAndLastOrNull()
    firstOrNullAndLastOrNull.printSome()

    val countFunction = CountFunction()
    countFunction.printSome()

    //associateBy and groupBy below

    val people = listOf(                                                     //Defines a collection of people.
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

    //Builds a map from phone numbers to their owners' information. it.phone is the keySelector here.
    // The valueSelector is not provided, so the values of the map are Person objects themselves.
    val phoneBook = people.associateBy { it.phone }

    //Builds a map from phone numbers to the cities where owners live. Person::city is the valueSelector here,
    // so the values of the map contain only cities.
    val cityBook = people.associateBy(Person::phone, Person::city)

    //Builds a map that contains cities and people living there. The values of the map are lists of person names.
    val peopleCities = people.groupBy(Person::city, Person::name)

    println("People: $people")
    println("Phone book: $phoneBook")
    println("City book: $cityBook")
    println("People living in each city: $peopleCities")

    println("partition function")

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val evenOdd = numbers.partition { it % 2 == 0 }           //Splits numbers into a Pair of lists with even and odd numbers.

    //Splits numbers into two lists with positive and negative numbers.
    // Pair destructuring is applied here to get the Pair members.
    val (positives, negatives) = numbers.partition { it > 0 }

    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")
    println("Odd numbers: ${evenOdd.second}")
    println("Positive numbers: $positives")
    println("Negative numbers: $negatives")

    println("flatMap function")

    val tripled = numbers.flatMap { listOf(it, it, it) } // 2
    val normalAndSquare = numbers.flatMap { listOf(it, it*it) } // 2

    println("Numbers: $numbers")
    println("Transformed: $tripled")
    println("Transformed diferent: $normalAndSquare")

    println("minOrNull, maxOrNull")

    val threeNumbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()

    println("Numbers: $numbers, min = ${threeNumbers.minOrNull()} max = ${threeNumbers.maxOrNull()}")
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")

    println()
    println("sorted function")
    val sortedFunction = SortedFunction()
    sortedFunction.printSome()

    println("Map element access")
    val mapElementAccess = MapElementAccess()
    mapElementAccess.printSome()

    println("Zip function")
    val zipFunction = ZipFunction()
    zipFunction.printSome()

    println("Get or else function")
    val getOrElseFunction = GetOrElseFunction()
    getOrElseFunction.printSome()
}