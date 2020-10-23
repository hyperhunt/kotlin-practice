enum class ColorEnum(var colorHex: String , var opacity: Double? = null) {
    WHITE("#FFFFFF") ,
    BLACK("#000000" , 0.5) ,
    RED("#FF0000") ,
    GREEN("#008000");

    fun some() {
        // Not recommended using fun logic in Enum
        println("Enum -> Color")
    }
}