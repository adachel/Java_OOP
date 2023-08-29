package HomeWorks.HomeWork1;

public class Product {
    private String prodName;
    private double price;
    private int rating;

    public Product(String prodName, double price, int rating) {
        this.prodName = prodName;
        this.price = price;
        this.rating = rating;
    }

    public Product(String prodName) {
        this.prodName = prodName;
        this.price = 0;
        this.rating = 0;
    }

    public String getProdName() {return prodName;}

    public double getPrice() {return price;}

    public int getRating() {return rating;}

    @Override
    public String toString() {
        return "Наименование: " + prodName + "; " + "цена: " + price + "; " + "рейтинг: " + rating;
    }
}
