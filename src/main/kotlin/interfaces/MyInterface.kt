package interfaces

interface MyInterface {
    val property1: Int
        get() = 42

    fun fun1()

    fun fun2() {
        println("MyInterface - default")
    }
}