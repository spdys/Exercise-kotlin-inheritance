package library

class NonFictionBook(title: String, author: String, ISBN: Long, var subjectArea: String) : Book(title, author, ISBN)  {
    fun displaySubjectArea() {
        println("Subject Area: $subjectArea")
    }
}