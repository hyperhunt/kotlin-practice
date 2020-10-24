import java.io.File

// apply , let , run , with , also, takeIf

//fun main() {
//    val name = null
//    println(grettingGuest(name))
//}
//
//fun grettingGuest(guest: String?): String {
//    return guest?.let {
//        "Welcome, $it."
//    } ?: "Welcome guest in tavern."
//}

//fun main() {
//    // /home/tony/github/kotlin/kotlin-practice/src/main/resources/text-file
//    val fileName = "src/main/resources/text-file"
////    val searchText = fileName.run {
////        readText().contains("string3")
////    }
////    println(searchText)
//
//    val myList = mutableListOf<String>()
//    File(fileName).useLines { lines -> myList.addAll(lines) }
//    myList.forEachIndexed { i, line -> println("${i}: " + line) }
//
//    fnRun()
//}
//
//fun fnRun () {
//    fun nameIsLOng (name: String) = name.length > 5
//
//    fun playerMessage (nameTooLong: Boolean): String {
//        return if (nameTooLong) {
//            "Name is too long"
//        } else {
//            "Welcome, adventure!"
//        }.toString()
//    }
//
//    "Tony, supreme Master of Coding"
//        .run(::nameIsLOng)
//        .run(::playerMessage)
//        .run(::println)
//}

fun main() {
    var fileContents: List<String>
    File("src/main/resources/text-file")
        .also {
             println(it.name)
        }.also { fileContents = it.readLines() }
    println(fileContents)
    println(fileContents[0])
    println(fileContents[2])
//    { i, line -> println("${i}: " + line) }
    fileContents.forEachIndexed { i , line -> println("${i}: " + line) }

    val fContents = File("src/main/resources/text-file")
        .takeIf { it.canRead() && it.canWrite() }
        ?.readText()
    println(fContents)
}