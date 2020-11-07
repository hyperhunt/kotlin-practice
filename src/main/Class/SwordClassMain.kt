class SwordClass(_name: String) {
    var name: String = _name
        get() = "The legendary $field"
        set(value) {
            field = value.toLowerCase().reversed().capitalize().plus("www")
        }

    init {
        name = _name
    }
}

fun main() {
    val sword = SwordClass("Excalibur")
    println(sword.name)
    sword.name = "Gleipnir"
    println(sword.name)
}