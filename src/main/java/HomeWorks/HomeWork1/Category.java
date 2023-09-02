package HomeWorks.HomeWork1;


import java.util.ArrayList;

public class Category {
    private final String CategoryName;
    private final ArrayList<Product> products;

    public Category(String categoryName) {
        this.CategoryName = categoryName;
        this.products = new ArrayList<>();
    }
    public String getCategoryName() {
        return CategoryName;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @apiNote метод добавления товара в категорию
     * @param product товар
     */
    public void addProduct(Product product){
        products.add(product);
    }

    /**
     * @apiNote метод удаления товара из категории
     * @param product товар
     */
    public void removeProduct(Product product){
        products.remove(product);
    }

    @Override
    public String toString() {
        return "" + "\t" + products + "\n";
    }
}

