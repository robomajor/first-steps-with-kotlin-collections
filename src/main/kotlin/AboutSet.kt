class AboutSet {

                                //Creates a Set with given elements.
    val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")
    val setOfOpenIssues: Set<String> = openIssues

    fun addIssue(uniqueDesc: String): Boolean {
        return openIssues.add(uniqueDesc)     //Returns a boolean value showing if the element was actually added.
    }

    fun getStatusLog(isAdded: Boolean): String {        //Returns a string, based on function input parameter.
        return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
    }

    fun getIssuesSet(): Set<String> {
        return setOfOpenIssues
    }

}