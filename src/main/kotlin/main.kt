fun main() {
    val userJava = UserJava("tony@kotlin.dev")
    println("Java example: ${userJava.email}")

    val userKotlin = UserKotlin("test@kotlin.dev")
    println("Kotlin example: ${userKotlin.email}")

    // Array
    val items: Array<Int> = arrayOf(5,7,12,4,0,13)
//    val someArray = arrayOf("String")

//    println(items.set(0, 45))
//    println(items[0])
//    println(items.get(5))
//    println(items.size)
//
//    for (el in items) {
//        print("${el}: ")
//    }

    items.forEach {
        print(it)
    }
    println("")
    items.forEachIndexed {index, el -> print ("${index}: $el ")}
}