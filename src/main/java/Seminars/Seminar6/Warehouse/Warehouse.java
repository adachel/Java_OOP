package Seminars.Seminar6.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements ProductHelper{ // S - Single Responsibility Principle - принцип единственной ответственности

    private List<Product> warehouse = new ArrayList<>();

    public Warehouse(List<Product> warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void addProduct(Product product) {
        warehouse.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        warehouse.remove(product);
    }

    public boolean takeMyProduct(Product product, int amount) {
        for (Product prod : warehouse) {
            if (prod.equals(product)){
                if (prod.getQuantity() > amount){
                    prod.decreaseQuantity(amount);
                    return true;
                } else System.out.println("Столько нет нa склaде");
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Warehouse {" +
                "warehouse= " + warehouse +
                '}';
    }
}
