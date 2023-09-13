package Seminars.Seminar5.MVC.Data;

public class Human extends User{
    private String address;

    public Human(String name, String address) {
        super(name);
        this.address = address;
    }
}
