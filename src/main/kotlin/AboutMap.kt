class AboutMap {

    val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
    val EZPassReport: Map<Int, Int> = EZPassAccounts                //Creates a read-only view of the Map.

    fun updatePointsCredit(accountId: Int) {
        if (EZPassAccounts.containsKey(accountId)) {                //Checks if the Map's key exists.
            println("Updating $accountId...")
            EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
        } else {
            println("Error: Trying to update a non-existing account (id: $accountId)")
        }
    }

    fun accountsReport() {
        println("EZ-Pass report:")
        EZPassReport.forEach {                        //Iterates immutable Map and prints key/value pairs.
                (k, v) -> println("ID $k: credit $v")
        }
    }
}

const val POINTS_X_PASS: Int = 15