//fun main() {
//    val healthPoints = 76
//    val isBlessed = true
//    val healthStatus = healthPoints.formatHealthStatus(isBlessed)
//    println(healthStatus)
//
//
//}
//
//private fun Int.formatHealthStatus(isBlessed: Boolean): String {
//    return when (this) {
//        100 -> "is in excellent condition!"
//        in 90..99 -> "has a few scratches."
//        in 75..89 -> if(isBlessed) {
//            "has some minor wounds, but is healing quite quickly!"
//        } else {
//            "has some minor wounds."
//        }
//        in 15..74 -> "looks pretty hurt."
//        else -> "is in awful condition!"
//    }
//}

//fun main() {
////    val numLetters = "Moscow".count { letter -> letter == 'o' }
////    println(numLetters)
////
////    println({
////        val name = "Tony"
////        "Welcome, $name!"
////    }())
//
//    runSimulation("Tony") { playerName, numBuildings ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
//    }
//}
//
//inline fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
//    val numBuildings = (1..3).shuffled().last()
//    println(greetingFunction(playerName, numBuildings))
//}

fun main() {
    runSimulation()
}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}