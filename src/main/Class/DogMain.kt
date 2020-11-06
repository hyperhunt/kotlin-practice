data class Dog (val name: String, var weight: Int, val breed: String) {
    fun bark() {
        println(if(weight < 20) "Yip!" else "Woof!")
    }
}

fun main() {
    val dog = Dog("Pitti", 18, "Haski")
    println(dog.toString())
    dog.bark()

    val dogs = arrayOf(Dog("One", 70, "Mixed"), Dog("Two", 10, "Arch"))
    dogs[0].weight = 42
    println(dogs[0].toString())
    dogs[0].bark()
}