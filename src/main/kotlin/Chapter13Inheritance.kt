open class Inheritance(val name: String) {
    //    protected open val dangerLevel = 5
    open val dangerLevel = 5
    fun description() = "Room: $name, Level: $dangerLevel"
    open fun load() = "Nothing much to see here..."

    //    init {
//        println("dangerLevel: $dangerLevel")
//    }
    open fun inheritA() {
        println("fun of inheritA()")
    }
}

open class TownSquare : Inheritance("Town Square") {
    override val dangerLevel = super.dangerLevel - 2

    private val bellSound = "GWONG"
    override fun load() = "The villagers rally and cheer as you enter!\n${ringBell()}"
    private fun ringBell() = "The bell tower announces your arrival. $bellSound"
}

open class InheritanceB : TownSquare() {
    open fun inheritB() {
        println("inheritB() of InheritanceB")
    }
//
//    override fun load(): String {
//        super<TownSquare>.load()
//        super
//        return
////        return " [override]"
//    }

//    override val dangerLevel: Int = .dangerLevel + 3
//    override fun load() = super.load() + " [final]"

    init {
        println("Costructor() of InheritanceB")
    }
}

fun main() {
    val currentRoom = Inheritance("Foyer")
    println(currentRoom.name)
    println(currentRoom.description())
    println(currentRoom.load())
    currentRoom.inheritA()

    println(" ")

    val townSquare = TownSquare()
    println(townSquare.name)
    println(townSquare.description())
    println(townSquare.load())

    println(" ")

    val inheritB = InheritanceB()
    inheritB.inheritB()
    println(inheritB.name)
    println(inheritB.description())
    println(inheritB.load())
    inheritB.inheritA()
}