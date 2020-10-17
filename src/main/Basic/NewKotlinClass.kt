class NewKotlinClass : MainUserProvider() {
    override val db: String
        get() = "DB not connected"
    override val info: String
        get() = "New method of NewKotlinClass()"

    override fun printProvider(user: User) {
        super.printProvider(user)
        println("Text of printProvider()")
    }
}