package library

open class Book(var title: String, var author: String, var ISBN: Long) {
    fun displayInfo() {
        println("$title by $author (Hardcover ISBN: $ISBN)")
    }
}