/*
* Один экземпляр с непротиворечивым состоянием, существующий на протяжении всего времени работы программы, объявите синглтон.
* Есть три способа применения ключевого слова object : для создания объявлений объектов (синглтонов), анонимных объектов и вспомогательных объектов.
*
* */

// Singleton
// Anonymous object
// Companion object

open class Sword {

    companion object {
        private var nextid = 0
        fun hello() {
            println("Sword: $nextid")
            nextid++
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
    Sword.hello()
//    Game.play()
//    Sword.hello()
}