//import java.io.File

//
//const val TAVERN_NAME = "Taernyl's Folly"
//var playerGold = 10
//var playerSilver = 10


//fun main() {
//    val patronList: List<String> = listOf("Tony", "Hyper", "Hunt")
//    //    println(this.first())
////    println(this.last())
////    println(patronList[4])
//    val result: String = patronList.getOrElse(4) { "Unknow Patron" }
//    println(result)
//
//    with(patronList) {
//        println(first())
//        println(last())
////    println(patronList[4])
////        result =
//        println(getOrElse(4) { "Unknow Patron" })
//
//        println(contains("Tony"))
//    }
//}

fun String.print() = println(this)
fun MutableList<String>.print() = println(this)
fun Set<String>.print() = println(this)

fun main() {
    val planets = setOf("Mercury" , "Venus" , "Earth", "Earth", "Earth")
    planets.print()
    println(planets.contains("Mercury"))
    println(planets.elementAt(1))
}

//fun main() {
//    val text = "Tony"
//    text.print()
//    val patronList = mutableListOf("Tony" , "Hyper" , "Hunt")
//    patronList += "Hooper"
//    patronList.print()
//    val coo = "text"
//    coo.print()

//    Read data from file
//    val mList = File("")
//        .readText()
//        .split("\n")

//    println(patronList)
//    println(patronList.removeIf {it.contains("Hooper")})
//    patronList.remove("Hunt")
//    println(patronList)
//    patronList.add(0 , "Gomer")
//    println(patronList)
//
//    for (patron in patronList) println("Hello patron, $patron!")
//
//    patronList.forEach { patron ->
//        println("Hello patron, $patron!")
//    }

//    val menuData = "sdf ds, sdf, sd,f sdf ,sd f,sdf"
//    val (type, name, price) = menuData.split(',')
//    println(message = "$type, $name, $price")
//}