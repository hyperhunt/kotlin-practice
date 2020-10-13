fun main() {
    val userJava = UserJava("tony@kotlin.dev")
    println("Java example: ${userJava.email}")

    val userKotlin = UserKotlin("test@kotlin.dev")
    println("Kotlin example: ${userKotlin.email}")
    println()
}