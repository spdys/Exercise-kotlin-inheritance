import library.FictionBook
import library.NonFictionBook

fun main() {
    val fictionBook = FictionBook("Annie Bot", "Sierra Greer", 9780063312692, "Science Fiction")
    fictionBook.displayInfo()
    fictionBook.displayGenre()

    val nonFictionBook = NonFictionBook("The Science of Stuck", "Britt Frank", 9780593419441, "Psychology")
    nonFictionBook.displayInfo()
    nonFictionBook.displaySubjectArea()
}