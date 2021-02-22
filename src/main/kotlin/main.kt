fun main() {

    val aboutList = AboutList()

    aboutList.addSudoer(4)            //Updates the MutableList. All related read-only views are updated as well
                                                        // since they point to the same object.
    println("Tot sudoers: ${aboutList.getSysSudoers().size}")               //Retrieves the size of the read-only list.
    aboutList.getSysSudoers().forEach {                                     //Iterates the list and prints its elements.
            i -> println("Some useful info on user $i")
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
}
