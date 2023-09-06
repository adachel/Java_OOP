package Seminars.Seminar4;

public class User {
    public int getAge(){
        if (this instanceof Student) return getAge();
        else return 0;
    }
    private String firstName;
    private String secondName;

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getSecondName() {return secondName;}
    public void setSecondName(String secondName) {this.secondName = secondName;}

    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
