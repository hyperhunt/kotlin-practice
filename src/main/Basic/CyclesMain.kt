fun main() {
//    var index: Int = 0
//    while (index < 10) {
//        print("$index ")
//        index++
//    }

//    do {
//        print("$index ")
//        index++
//    } while (false)

    val numRange = 1..10
    for (value in numRange) print("$value ")
    println("")
    for (value in numRange step 2) print("$value ")
    println("")
    for (value in 10 downTo 5) print("$value ")
    println("")
    val value = 3
    println(value in numRange)
    println("")
    val characters = 'a'..'z'
    println(isChar('/' , characters))
    println(isChar('A' , characters))
    println(isChar('z' , characters))
}

fun isChar(char: Char , character: CharRange) = char in character