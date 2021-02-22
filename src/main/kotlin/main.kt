fun main() {

    val aboutList = AboutList()

    aboutList.addSudoer(4)            //Updates the MutableList. All related read-only views are updated as well
                                                        // since they point to the same object.
    println("Tot sudoers: ${aboutList.getSysSudoers().size}")               //Retrieves the size of the read-only list.
    aboutList.getSysSudoers().forEach {                                     //Iterates the list and prints its elements.
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!           //Attempting to write to the read-only view causes a compilation error.
}
