package Seminars.Seminar6.Library;

import java.util.ArrayList;
import java.util.List;

public class Bibliory implements Searchable{
    private List<Book> books = new ArrayList<>(); // список книг

    public Bibliory(List<Book> books) {
        this.books = books;
    }

    @Override
    public Book findByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }
}
