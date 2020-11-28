fun main() {
    val student1 = DataStudent("Tony" , "Hunt" , "1")
    val student2 = DataStudent("Tony" , "Hunt" , "1")
    println(student1)
    println(student1.hashCode())
    println(student2)
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)

    // destructor
//    val (name, lastName, id) = student1
//    println("$name, $lastName, $id")

    val student3 = student1.copy("3")
    println("3: $student3")

    val student4 = student1.copy("4")
    println("4: $student4")

    println(student3.hashCode())
    println(student4.hashCode())
}