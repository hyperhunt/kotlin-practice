// POJO: data (get/set), copy

fun main() {
    val person = PojoDataClassPerson("Tony", 42)
    val person2 = person.copy(age = 1)
//    person.age = 13
    println(person)
    println(person2)
    val (name, age) = person
    println("Name: $name, age: $age")
}