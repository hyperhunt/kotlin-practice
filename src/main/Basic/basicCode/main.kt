//fun main() {
//    val userJava = UserJava("tony@kotlin.dev")
//    println("Java example: ${userJava.email}")
//
//    val userKotlin = UserKotlin("test@kotlin.dev")
//    println("Kotlin example: ${userKotlin.email}")
//
//    // Array
////    val items: Array<Int> = arrayOf(5,7,12,4,0,13)
////    val someArray = arrayOf("String")
//
////    println(items.set(0, 45))
////    println(items[0])
////    println(items.get(5))
////    println(items.size)
////
////    for (el in items) {
////        print("${el}: ")
////    }
//
////    items.forEach {
////        print(it)
////    }
////    println("")
////    items.forEachIndexed {index, el -> print ("${index}: $el ")}
//
////    val items = listOf(5,7,12,4,0,13)
//    val items: MutableList<Int> = mutableListOf(5, 7, 12, 4, 0, 13)
//
//
//    println(items.last())
//    println(items.indexOf(13)) // Find 5 in first position [0]
//
//    val user = mapOf("name" to "Tony", "age" to 42, "isHasCar" to true).also {
//        println(it)
//    }
//    user.forEach { (key, value) -> println("$key -> $value")}
//
//    printArray(items)
//}
//
//fun printArray(items: List<Any>) {
//    items.forEach {
//        println(it)
//    }
//}

//fun fnSomething(vararg word: Any) {
//    var i = 0
//    word.forEach { el -> print("${++i}-$el ") }
//    println("")
//}
//fun main() {
//    val names = arrayOf("Tony", "Hyper", "Hunt")
//    fnSomething()
//    fnSomething("Hello")
//    fnSomething("Hello", "Tony")
//    fnSomething("Hello", "Tony", 42, *names)
//}

enum class  Animals {
    DOG, CAT, BEAR, LION;

    fun toLowerCase() = name.toLowerCase().capitalize()
}

fun main() {
//    var items = 5
//    while (items > 0) { println(items--) }
//    do {
//        println(items)
//    } while (items == 5)

//    for (i in 1..10 step 2) { println(i) }
//    for (i in 10 downTo 1 step 3) { println(i) }
//    for (el in 'a'..'z') { print("$el ") }

//    val x = 20
//    if (x in 5..50) { println("Variable: $x") }

    // OOP Class
//    val tony = User()
//    tony.firstName = "Tony"
//    tony.secondName = "Hunt"
//    println("${tony.firstName} ${tony.secondName}")
//    tony.printUser()

//    val tony = User("Tony", "Hyper")
//    tony.firstName = "First"
//    tony.secondName = "Second"
////    tony.printUser()
//    tony.login = "tnx"
//    tony.login = "Psx"
//    println(tony.login)
//    tony.login

//    var peter = User()
//    peter.printUser()
//    var bob = User("Bob")
//    bob.printUser()
//    tony.printUser("HO", "NU")

//    user.printProvider(User())
//    println(user.getConnection())
//    val user = NewKotlinClass()
    val user = object : MainUserProvider() {
        override fun printProvider(user: User) {
            super.printProvider(user)
            println("Text of printProvider()")
        }
    }
    checkDataTypes(user)

    when(Animals.BEAR) {
        Animals.CAT -> println(Animals.CAT.toLowerCase())
        Animals.DOG -> println(Animals.DOG.toLowerCase())
        Animals.LION -> println(Animals.LION.toLowerCase())
        Animals.BEAR -> println(Animals.BEAR.toLowerCase())
    }
}

fun checkDataTypes(obj: UserInfoProvider) {
    obj.printProvider(User())

    if (obj is DbConnection) {
        println(obj.getConnection())
    }
}