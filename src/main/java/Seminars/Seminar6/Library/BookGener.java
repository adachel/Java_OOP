package Seminars.Seminar6.Library;

public class BookGener implements Gener{
    private String generOfBook;

    public BookGener(String generOfBook) {
        this.generOfBook = generOfBook;
    }

    @Override
    public String takeGener() {
        return generOfBook;
    }

    @Override
    public String toString() {
        return "BookGener{" +
                "generOfBook='" + generOfBook + '\'' +
                '}';
    }
}
