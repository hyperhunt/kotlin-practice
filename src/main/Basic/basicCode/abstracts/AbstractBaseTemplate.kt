package abstracts

abstract class AbstractBaseTemplate {
    var count = 0
    fun a() {
        count++
        println("AbstractBaseTemplate: $count")
    }

    abstract fun minus()
}