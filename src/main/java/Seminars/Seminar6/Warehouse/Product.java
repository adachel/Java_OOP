package Seminars.Seminar6.Warehouse;

import java.util.Objects;

public class Product { // S - Single Responsibility Principle - принцип единственной ответственности
    private String name;
    private int price;
    private int quantity; // кол-во

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity(int amount){
        this.quantity = quantity - amount;
    }
    public void increaseQuantity(int amount){
        this.quantity = quantity + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "Product {" +
                "quantity= " + quantity +
                '}';
    }
}
