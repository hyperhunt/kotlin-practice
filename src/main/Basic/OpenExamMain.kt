import openexam.OpenExamDriver
import openexam.OpenExamPerson

fun main() {
    val person = OpenExamPerson("Tony")
    val driver = OpenExamDriver("Tony")
    println(person)
    println(driver)

    println(person.getAdress())
    println(driver.getAdress())
}