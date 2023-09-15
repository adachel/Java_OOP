package Seminars.Seminar6.Warehouse;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("milk", 100, 100);
        Product product2 = new Product("asdasd", 200, 100);
        Product product3 = new Product("ghjgh", 300, 100);
        Product product4 = new Product("milwerre", 400, 100);
        Alcohol alcohol = new Alcohol("beer", 200, 5);

        Warehouse warehouse = new Warehouse(Arrays.asList(product1, product2, product3, product4, alcohol));

        System.out.println(warehouse);

        Order order = new Order(warehouse);
        order.processOrder(product1, 50);
        System.out.println(warehouse);
        order.processOrder(product1, 50);
        System.out.println(warehouse);

    }
}
