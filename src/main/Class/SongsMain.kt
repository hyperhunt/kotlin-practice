data class Songs(val title: String, val artist: String) {
    fun play() {
        println("Playing: $title - $artist")
    }

    fun stop() {
        println("Stopped: $title - $artist")
    }
}

fun main() {
    val songOne = Songs("Yellow submarine", "Beatles")
    val songTwo = Songs("Make me smile", "Steve Harley")

    songOne.play()
    songOne.stop()
    songTwo.play()
}