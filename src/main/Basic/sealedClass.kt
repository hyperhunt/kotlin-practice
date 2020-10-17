sealed class Db {
    data class MySQL(val id: Int, val conn: String) : Db()
    data class MongoDb(val id: Int, val conn: String) : Db() {
        fun printInfo() {
            println("MongoDb has id: $id and connection: $conn.")
        }
    }

    data class PostgreSQL(val id: Int, val conn: String, val isDone: Boolean) : Db() {
        fun printInfo() {
            println("PostgreSQL has id: $id and connection: $conn.")
        }
    }


    object Help : Db() {
        val conn = "Connection done."
    }
}