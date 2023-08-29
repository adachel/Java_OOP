package HomeWorks.HomeWork1;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> prod;

    public Basket() {this.prod = new ArrayList<>();}

    public ArrayList<Product> getProd() {return prod;}

    public void addProduct(Product product){prod.add(product);}
    public void removeProduct(Product product){prod.remove(product);}

}
