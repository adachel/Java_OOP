package HomeWorks.HomeWork1;

public class Product {
    private final String productName;
    private double price;
    private int rating;

    public Product(String productName, double price, int rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }
    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {return productName;}

    public double getPrice() {return price;}

    public int getRating() {return rating;}

    @Override
    public String toString() {
        return "Наименование: " + productName + "; " +
                "цена: " + price + "; " +
                "рейтинг: " + rating;
    }
}
