class TestClass {
    var name = "tony"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
    fun castFireball(numFireball: Int = 2) = println("castFireball from Class: $numFireball")

    val rolledValue
        get() = (1..6).shuffled().first()
}