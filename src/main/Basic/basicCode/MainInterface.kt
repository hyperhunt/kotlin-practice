import abstracts.AbstractBaseTemplate
import abstracts.AbstractTemplate
import interfaces.InterfaceClassA
import interfaces.InterfaceClassB
import interfaces.MyInterface


fun main() {
    val v1: MyInterface = InterfaceClassA()
    val v2: MyInterface = InterfaceClassB()
    v1.fun1()
    v2.fun1()
    println(v1.property1)

    val a1: AbstractBaseTemplate = AbstractTemplate()
    a1.a()
    a1.minus()
    a1.a()
}