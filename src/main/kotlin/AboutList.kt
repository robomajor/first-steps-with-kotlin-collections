class AboutList {

    val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        //Creates a MutableList.
    val sudoers: List<Int> = systemUsers                              //Creates a read-only view of the list.

    fun addSudoer(newUser: Int) {                                     //Adds a new item to the MutableList.
        systemUsers.add(newUser)
    }

    fun getSysSudoers(): List<Int> {                                  //A function that returns an immutable List.
        return sudoers
    }

}