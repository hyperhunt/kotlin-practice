// Data class
// Переобределяемые методы toString(), equals(), hashcode().
// Деструктивные операторы component()
// Метод copy()

class DataStudent(
    val name: String ,
    val lastName: String ,
    val id: String ,
) {
    fun copy(
        name: String = this.name ,
        lastName: String = this.lastName ,
        id: String = this.id ,
    ): DataStudent = DataStudent(name , lastName , id)

    fun toString(name: String , lastName: String , id: String): String = "${this.name} ${this.lastName} ${this.id}"


//    override fun toString(): String {
//        return this.toString()
//    }
//
//    override fun equals(other: Any?): Boolean {
//        return super.equals(other)
//    }
//
//    override fun hashCode(): Int {
//        return super.hashCode()
//    }
//    operator fun component1()  = name
//    operator fun component2()  = lastName
//    operator fun component3()  = id
}