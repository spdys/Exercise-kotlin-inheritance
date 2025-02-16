package library

class FictionBook(title: String, author: String, ISBN: Long, var genre: String) : Book(title, author, ISBN)  {
    fun displayGenre() {
        println("Genre: $genre")
    }
}