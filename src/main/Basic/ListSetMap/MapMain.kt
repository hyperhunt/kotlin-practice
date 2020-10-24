import java.io.File

val str = File("src/main/resources/data.txt")
    .readText()
    .split("\n")

fun main() {
    println(str)
    str.forEach { iter ->
//        println("$iter")
        val (name , _ , gold) = iter.split(",")
        val uniquePatrons = setOf(name , gold)
        println(uniquePatrons)
    }
//    println(uniquePatrons)

    shuffledMutable()

}

fun shuffledMutable() {
    val items = listOf(1 , 2 , 3)
    println(items.shuffled())
    println(items.shuffled())
    println(items.shuffled())

}
