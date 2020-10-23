enum class ColorWhen(var colorHex: String , var opacity: Double? = null) {
    WHITE("#FFFFFF") ,
    BLACK("#000000" , 0.5) ,
    RED("#FF0000") ,
    GREEN("#008000");
}