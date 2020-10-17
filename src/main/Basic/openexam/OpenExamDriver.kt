package openexam

class OpenExamDriver(name: String) : OpenExamPerson(name) {

    override val age: Int = 2

    override fun getAdress(): String {
        return "Test2"
    }

    override fun toString(): String {
        return "OpenExamDriver(age=$age, name=$name)"
    }


}