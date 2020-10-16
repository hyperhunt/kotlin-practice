class classCar (private var weight: Double, private var size: Int) {
    var isNew: Boolean
        get() {
            return weight > size
        }
    set(value) {
        if (value)
            println(value)
        else
            println(value)

    }
}