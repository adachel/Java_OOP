package HomeWorks.HomeWork1;

public class User {
    private String login;
    private String pass;
    private Basket basket;

    public String getLogin() {return login;}

    public String getPass() {return pass;}

    public Basket getBasket() {return basket;}

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
        this.basket = new Basket();
    }
}
