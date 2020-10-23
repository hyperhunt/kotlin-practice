import ColorWhen.*

fun main() {
//    var number = 33
//    var result =  when(number) {
//        1 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        else -> {
//            "Enething: ${number}"
//        }
//    }
//    println(result)

//    val color: ColorWhen = GREEN
//    val result = getFavoriteColor(BLACK)
//    println(color)
    println(getFavoriteColor(RED))

    when (setOf(WHITE , BLACK)) {
        setOf(WHITE , BLACK) -> println("White-Black color")
        setOf(GREEN , WHITE) -> println("Green-White")

//        RED -> "Red color"
    }

    val a = 2
    val b = 4
    when {
        (a > b) -> println("$a > $b = ${a > b}")
//        (a < b) -> println("$a < $b = ${a < b}")
        (a == b) -> println("$a == $b = ${a == b}")
        else -> println("Nothing")
    }
}

fun getFavoriteColor(color: ColorWhen) = when (color) {
    BLACK -> "Black color"
    GREEN , WHITE -> "Green-White"
    RED -> "Red color"
//    else -> {
//        "Anything: $color"
//    }
}