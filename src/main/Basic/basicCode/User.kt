class User (var firstName: String = "Peter", var secondName: String = "Patrik") {
// public, private, internal, protected

    var login: String? = null
        set(value) {
            if(value == "Psx") field = "Noob" else field = value
            println("Login value: $field")
        }
        get() {
            val loginField = field ?: "Unknow"
            println("Value = $loginField")
            return "get(): $field"
        }

    fun printUser() {
        println("$firstName $secondName")
    }
}

//class User(_firstName: String, _secondName: String) {
//    //    constructor()
//    private var firstName: String = _firstName
//    private var secondName: String = _secondName
//
//    fun printUser() {
//        println("$firstName $secondName")
//    }
//
//    constructor(): this("Peter", "Patric") {
//        println("Add empty constructor.")
//    }
//
//    constructor(firstName: String): this(firstName, "Parket"){
//        println("$firstName $secondName")
//    }
//
//}

//class User {
//    var firstName : String = "Kotlin"
//    var secondName: String = "Hyper"
//
//    fun printUser() {
//        println("$firstName $secondName")
//    }
//}