package openexam

open class OpenExamPerson (val name: String) {

    open val age: Int = 0
    open fun getAdress(): String {
        return "Test"
    }
    override fun toString(): String {
        return "OpenExamPerson(name='$name')"
    }
}