package interfaces

class InterfaceClassB : MyInterface {
    override fun fun1() {
        println("InterfaceClassB")
    }

    override fun fun2() {
        super.fun2()
    }

//    override val property1: Int
//        get() = 42
}