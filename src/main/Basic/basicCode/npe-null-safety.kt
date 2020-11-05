fun main() {
    val st: String? = getSt()
    val size = st?.length
    println(size)
}

fun getSt(): String? {
//    throw KotlinNullPointerException()
    return null
}

fun main() {
    do {
        val i: Int? = readLine()?.toIntOrNull()
        when (i) {
            in -300..300, in -1000..1000 -> println("$i in range.")
            else -> println("$i out of range.")
        }
    } while (i != null)
}