interface UserInfoProvider {
    val info: String
    fun printProvider(user: User) {
        println(info)
        user.printUser()
    }
}

//class MainUserProvider : UserInfoProvider {
//    // abstruct
//    override fun printProvider(user: User) {
//        println("Method used")
//        user.printUser()
//    }
//}

interface DbConnection {
    fun getConnection() : String
}

open class MainUserProvider : UserInfoProvider, DbConnection {
    protected open val db: String = "DbConnected"
    override val info: String
        get() = "Method was colled."

    override fun printProvider(user: User) {
        super.printProvider(user)
        println("Last message.")
    }

    override fun getConnection(): String {
        return db
    }
}