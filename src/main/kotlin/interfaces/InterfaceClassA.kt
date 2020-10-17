package interfaces

class InterfaceClassA : MyInterface {
    override fun fun1() {
        println("InterfaceClassA")
    }

    override fun fun2() {
        super.fun2()
    }
}