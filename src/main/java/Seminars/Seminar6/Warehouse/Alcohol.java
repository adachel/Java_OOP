package Seminars.Seminar6.Warehouse;

public class Alcohol extends Product{ // Liskov Substitution Principle - принцип подстaновки Бaрбaры Лисков (нaследники)
    private int age;

    public Alcohol(String name, int price, int quantity, int age) {
        super(name, price, quantity);
        this.age = age;
    }

    public Alcohol(String name, int price, int quantity) {
        super(name, price, quantity);
    }

    public boolean canBay(int age){
        if (age > 18){
            return true;
        }
        return false;
    }
}
