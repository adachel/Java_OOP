package Seminars.Seminar6.Library;

public class Book {
    private String name;
    private String author;
    private BookGener bookGener;

    public Book(String name, String author, BookGener bookGener) {
        this.name = name;
        this.author = author;
        this.bookGener = bookGener;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookGener=" + bookGener +
                '}';
    }
}
