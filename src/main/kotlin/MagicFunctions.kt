fun main() {

    /* map */

//    val array = arrayOf(1 , 2 , 3 , 4 , 5)
//    var result = array.map { v -> "integer: $v" }
//    println(result.joinToString(", " , "#" , "@" , -1 , "..."))

    /* flatMap */

    // 0, 1, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 5
//    val result = array.map { 0..it }.flatten().joinToString(", ")
//    val result = array.flatMap { 0..it }.joinToString(", ")
//    println(result)

    /* fold */

    // поиски минимум, максимум, обход коллекций
//
//    val array = arrayOf(1 , 2 , 3 , 4 , 5 , 0 , -100 , 1024 , -100)
//
//    val result = array.fold(Int.MIN_VALUE) { acc , i ->
//        println("acc: $acc, i: $i")
//        max(acc , i) }
//    println(result)

    /* filter */

//    val array = arrayOf(1 , 2 , 3 , 4 , 5 , 0 , -100 , 1024 , 100)
//    val result = array.filter { abs(it) < 101 }
//    val result = array.filter { abs(it) in 3..101 }
//    println(result.joinToString(", "))

    val input = "Kotlin functions Kotlin are first-class, which means that they can be stored in variables and data structures, passsed as argument."

    val words = mutableListOf<String>()
    var currentWord = ""

    for (i in input.indices) {
        if(i == input.length-1) {
            currentWord += input[i]
            words.add(currentWord)
        }
        if(input[i] == ' ') {
            words.add(currentWord)
            currentWord = ""
        } else {
            currentWord += input[i]
        }
    }

    for (i in words.indices) {
        words[i] = words[i].toLowerCase()
        if (words[i].endsWith('.') || words[i].endsWith(',')) {
            words[i] = words[i].substring(0, words[i].length-1)
        }
    }

    var shortTestLength = Int.MAX_VALUE
    for (i in words.indices) {
        if(words[i].length < shortTestLength) {
            shortTestLength = words[i].length
        }
    }
    println("shortTestLength: $shortTestLength")

    var shortTestWords = mutableListOf<String>()
    for (i in words.indices) {
        if(words[i].length == shortTestLength) {
            shortTestWords.add(words[i])
        }
    }
    println("shortTestWords: $shortTestWords")

    val repeatingWords = mutableMapOf<String, Int>()
    for (i in words.indices) {
        val currentCount = repeatingWords[words[i]] ?: 0
        repeatingWords[words[i]] = currentCount + 1
    }
    println("repeatingWords: $repeatingWords")

    for (k in repeatingWords.keys) {
        println("$k: ${repeatingWords[k]}")
    }

    println("---")
    println(words.joinToString(", "))
    println(shortTestWords.joinToString(", "))
}