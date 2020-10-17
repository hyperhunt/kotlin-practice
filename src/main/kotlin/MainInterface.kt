import interfaces.InterfaceClassA
import interfaces.InterfaceClassB
import interfaces.MyInterface

fun main() {
    val v1: MyInterface = InterfaceClassA()
    val v2: MyInterface = InterfaceClassB()
    v1.fun1()
    v2.fun1()
    println(v1.property1)
}