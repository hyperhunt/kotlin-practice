fun main() {
//    val str = "Hello, how are you?"
//    val subStr = str.substring(0 until str.indexOf(","))
//    println(subStr)

    val text = "Taernyl's Fully"
    println(textConvert(text))
    println(text)

    val unicodeCapitalA = '\u0950'
    println(unicodeCapitalA)

    text.forEach { print("$it ") }
}

fun textConvert (phrase: String) =
    phrase.replace(Regex("[aeiou]")) {
        when (it.value) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }

    }