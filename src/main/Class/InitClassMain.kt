// Main init constructor

class InitClass(
    _name: String ,
//    _healthPoint: Int ,
//    _isBlessed: Boolean ,
//    _isImmortal: Boolean ,
    private var healthPoint: Int = 111 ,
    private val isBlessed: Boolean ,
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

    /*
    * Код выполнится только один раз, при первом обращении к делегированному свойству в методе чтения свойства name.
    * Все дальнейшие обращения к этому свойству будут использовать ранее полученный результат вместо повторных вычислений.
    * Отложенная инициализация полезна, но она слишком многословна, поэтому используйте ее только тогда, когда требуются сложные вычисления.
    * */
    private val printTown by lazy { selectHomeTown() } // Отложенная инициализация

    init {
        println("Hello World!")
        require(healthPoint > 0) { "healthPoints must be greater than zero." }
        require(name.isNotBlank()) { "Player must have a name." }
        println(printTown)
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
    println(init.name) // name of homeTown random

}