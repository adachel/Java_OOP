package HomeWorks.HomeWork1;

import java.util.ArrayList;

public class Basket {

    private final ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }
    public ArrayList<Product> getProduct() {
        return products;
    }

    /**
     * @apiNote метод добавление товара в корзину
     * @param product товар
     */
    public void addProduct(Product product){
        products.add(product);
    }

    /**
     * @apiNote метод удаления товара из корзины
     * @param product товар
     */
    public void removeProduct(Product product){
        products.remove(product);
    }

    @Override
    public String toString() {
        return "" + products;
    }
}
