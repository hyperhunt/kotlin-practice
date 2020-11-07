// Main init constructor

class InitClass(
    _name: String ,
//    _healthPoint: Int ,
//    _isBlessed: Boolean ,
//    _isImmortal: Boolean ,
    var healthPoint: Int = 111 ,
    val isBlessed: Boolean ,
    private val isImmortal: Boolean ,
) {
    var name = _name
        get() = "${field.capitalize()} of $homeTown, blessed: $isBlessed, immortal: $isImmortal"
        private set(value) {
            field = value.trim()
        }
//    val healthPoint = _healthPoint
//    val isBlessed = _isBlessed
//    private val isImmortal = _isImmortal

    constructor(name: String) : this(
        name ,
//        healthPoint = 80 ,
        isBlessed = true ,
        isImmortal = false ,
    ) {
        if(name.toLowerCase() == "hyper") {
            healthPoint = 42
        }
    }

    init {
        println("Hello World!")
        require(healthPoint > 0) { "healthPoints must be greater than zero." }
        require(name.isNotBlank()) { "Player must have a name." }
    }

    private val homeTown: String = selectHomeTown()
    private fun selectHomeTown(): String =
        arrayListOf("A1" , "B2" , "C3" , "GQ3" , "FB3" , "EC3" , "ARA4" , "BAB4").shuffled().first().toString()
}

fun main() {
//    val init = InitClass("Tony", 42,true,false)
//    val init = InitClass("Hyper")
    val init = InitClass(name = "Hunt")
//    val init = InitClass("Harper", 0,true,false) // Exception IllegalArgumentException
//    println(init.name)
//    println(init.healthPoint)
//    println(init.isBlessed)

//    println("${init.toString()}: ${init.name.toString()}, ${init.healthPoint.toString()}, ${init.isBlessed.toString()}.")
//    println(init.homeTown)
    println(init.name) // anme of homeTown random

}