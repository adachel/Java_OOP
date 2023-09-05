package Seminars.Seminar3.Ex001;

public enum Month {
    jan(1), feb(2), mar, apr, may, jun, jul, aug, sep, okt, nov, dec; // это реализации конструктора

    private int number; // для расширения имеющихся полей, добавляем поле

    Month(int number) { // конструктор
        this.number = number;
    }
    Month() { // пустой, здесь обязателен
    }

    public int getNumber() {return number;}
    public void setNumber(int number) {this.number = number;}
}
