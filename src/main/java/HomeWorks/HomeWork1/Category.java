package HomeWorks.HomeWork1;


import java.util.ArrayList;

public class Category {
    private String CategoryName;
    private ArrayList<Product> products;

    public Category(String categoryName) {
        this.CategoryName = categoryName;
        this.products = new ArrayList<>();
    }

    public String getCategoryName() {return CategoryName;}

    public ArrayList<Product> getProducts() {return products;}

    /**
     * @apiNote метод добавления экземпляра класса Product в класс Category
     * @param product экземпляр класса Product
     */
    public void addProduct(Product product){
        products.add(product);
    }

    /**
     * @apiNote метод удаления экземпляра класса Product в класс Category
     * @param product экземпляр класса Product
     */
    public void removeProduct(Product product){
        products.remove(product);
    }


    @Override
    public String toString() {
        return "" + products;
    }
}

