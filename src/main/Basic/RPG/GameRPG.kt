//import java.util.*
//
//val userName: String
//    get() {
//        val scanner = Scanner(
//            System.`in`
//
//        )
//        return scanner.nextLine()
//    }

fun String.firstChar(): Char {
    return this[0]
}

fun main(args: Array<String>) {
    val player = PlayerRPG("Tony" , "Hunter")
    for (i in 0 until 5) player.increaseXP(5)

    println("qwer".firstChar())
//    println("Please, input your name")
//    val userName = userName
//    println("Hello, " + userName)
}

