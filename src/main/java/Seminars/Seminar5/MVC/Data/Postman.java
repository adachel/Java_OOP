package Seminars.Seminar5.MVC.Data;

public class Postman extends User{
    private String occupation;

    public Postman(String name, String occupation) {
        super(name);
        this.occupation = occupation;
    }
}
