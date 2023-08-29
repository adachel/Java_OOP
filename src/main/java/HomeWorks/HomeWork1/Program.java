package HomeWorks.HomeWork1;

import java.util.ArrayList;

/**
 * Домашнее задание на закрепление:
 * 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * 3)Создать класс Basket, содержащий массив купленных товаров.
 * 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
 * 5)Вывести на консоль каталог продуктов. (все продукты магазина)
 * 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар,
 * а из магазина - удаляется)
 */

public class Program {
    public static void main(String[] args) {

//        Shop shop = new Shop();
//
//        Category category1 = new Category("electronics");
//        category1.addProduct(new Product("televizor", 500, 4));
//        category1.addProduct(new Product("smartphone", 100, 5));
//
//        Category category2 = new Category("milks");
//        category2.addProduct(new Product("kefir", 10, 4));
//        category2.addProduct(new Product("milk", 5, 5));
//
//        shop.addCategory(category1);
//        shop.addCategory(category2);
//
//        shop.printCatalog();
//        System.out.println();
//
//        User user1 = new User("qwerty", "12345");
//        User user2 = new User("asdffg", "2345");
//
//        user1.getBasket().addProduct(category1.getProducts().get(0));
//        user2.getBasket().addProduct(category2.getProducts().get(1));
//
//        category1.getProducts().remove(0);
//        category2.getProducts().remove(1);
//
//        System.out.println(user1.getLogin() + " - Bay:");
//        ArrayList<Product> user1Products = user1.getBasket().getProd();
//        for (Product product: user1Products){
//            System.out.println("- " + product.getProdName() + " - "
//                                    + product.getPrice() + " - "
//                                    + product.getRating());
//        }
//
//        System.out.println(user2.getLogin() + " - Bay:");
//        ArrayList<Product> user2Products = user1.getBasket().getProd();
//        for (Product product: user2Products){
//            System.out.println("- " + product.getProdName() + " - "
//                                    + product.getPrice() + " - "
//                                    + product.getRating());
//        }
//
//        System.out.println();
//        shop.printCatalog();


        Product milk = new Product("молоко", 50, 5);
        Product kefir = new Product("кефир", 70,5);

        Category milks = new Category("Молочные продукты");
        milks.addProduct(milk);
        milks.addProduct(kefir);
        milks.addProduct(new Product("сметана", 100, 5));

        Category cloth = new Category("Одежда");




        System.out.println(milks);






    }
}
