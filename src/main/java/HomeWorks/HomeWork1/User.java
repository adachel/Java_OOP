package HomeWorks.HomeWork1;

public class User {
    private final String login;
    private final String pass;
    private final Basket basket;

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
        this.basket = new Basket();
    }
    public String getLogin() {
        return login;
    }
    public String getPass() {
        return pass;
    }
    public Basket getBasket() {
        return basket;
    }
    @Override
    public String toString() {
        return "Покупатель: {"  +   "логин: '" + login + '\'' +
                                    ", пароль: '" + pass + '\'' + '}' + "\n" +
                                    "   Корзина: " + basket ;
    }
}
