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
    /**
     * @apiNote метод добавления товара в корзину и удаления из каталога
     * @param user покупатель
     * @param category категория товаров
     * @param product товар
     */
    public static void addBasket(User user, Category category, Product product){
        user.getBasket().addProduct(product);
        category.removeProduct(product);
        System.out.println(user);
    }

    /**
     * @apiNote метод удаления товара из корзины и добавление его в каталог
     * @param user покупатель
     * @param category категория товаров
     * @param product товар
     */
    public static void removeBasket(User user, Category category, Product product){
        user.getBasket().removeProduct(product);
        category.addProduct(product);
        System.out.println(user);
    }

    public static void main(String[] args) {

        Product milk = new Product("молоко", 50, 5);
        Product kefir = new Product("кефир", 70,5);
        Product skirt = new Product("юбка", 2500, 5);
        Product shirt = new Product("рубашка", 1500, 5);

        Category milks = new Category("Молочные продукты");
        milks.addProduct(milk);
        milks.addProduct(kefir);

        Category cloth = new Category("Одежда");
        cloth.addProduct(skirt);
        cloth.addProduct(shirt);

        Shop shop = new Shop();
        shop.addCategory(milks);
        shop.addCategory(cloth);

        System.out.println();
        System.out.println(shop);
        System.out.println();

        User user1 = new User("qwerty", "123456");
        addBasket(user1, milks, milk);
        System.out.println(shop);

        System.out.println();

        User user2 = new User("ytrewq", "123456");
        addBasket(user2, cloth, shirt);
        System.out.println(shop);

        System.out.println();

        removeBasket(user1, milks, milk);
        System.out.println(shop);
    }
}
