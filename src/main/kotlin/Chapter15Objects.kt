/*
* Один экземпляр с непротиворечивым состоянием, существующий на протяжении всего времени работы программы, объявите синглтон.
* Есть три способа применения ключевого слова object : для создания объявлений объектов (синглтонов), анонимных объектов и вспомогательных объектов.
*
* */

// Singleton
// Anonymous object
// Companion object

class Sword {
    companion object {
        fun hello() {
            println("Sword")
        }
    }
}

object Game {
    init {
        println("Welcome!")
    }

    fun play() {
        var cmd = 0
        var i = 0
        while (cmd != 5) {
            cmd = (1..10).shuffled().first()
            println("$i: $cmd")
            i++
        }
    }
}

fun main() {
    Game.play()
    Sword.hello()
}