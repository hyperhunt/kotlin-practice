fun main() {
//    println(classEnum.GREEN.name)
    val message: ColorEnum = ColorEnum.GREEN
    val message2: String = ColorEnum.RED.name
    println(message)
    println(message2)

    println(ColorEnum.BLACK)
    println(ColorEnum.BLACK.colorHex)
    println(ColorEnum.BLACK.opacity)
    ColorEnum.BLACK.some()
}