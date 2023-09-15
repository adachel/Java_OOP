package Seminars.Seminar6.Library;

public class HTMLFormater implements Formater{
    @Override
    public void formaatTo(Book book) {
        System.out.println("Книга преобразована в HTML");
    }
}
