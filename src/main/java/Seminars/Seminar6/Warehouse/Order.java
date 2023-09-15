package Seminars.Seminar6.Warehouse;

public class Order {
    private Warehouse warehouse;

    public Order(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void processOrder(Product product, int amount){
        if (warehouse.takeMyProduct(product, amount)){
            System.out.println("Взяли " + product + amount);
        }
    }
}
