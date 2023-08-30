package HomeWorks.HomeWork1;

import java.util.ArrayList;

public class Shop {
    private final ArrayList<Category> catalog;

    public Shop() {
        this.catalog = new ArrayList<>();
    }
    public ArrayList<Category> getCatalog() {
        return catalog;
    }

    /**
     * @apiNote метод добавления категории в каталог
     * @param category категория
     */
    public void addCategory(Category category){
        this.catalog.add(category);}

    @Override
    public String toString() {
        return "Каталог:" + "\n" + catalog;
    }
}

