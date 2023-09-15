package Seminars.Seminar6.Library;

public class electronBook extends Book{
    private int weight;  // рaзмер книги
    private FormatElectronBook format; // берем из 'Enum'

    public electronBook(String name, String author, BookGener bookGener, int weight, FormatElectronBook format) {
        super(name, author, bookGener);
        this.weight = weight;
        this.format = format;
    }
}
