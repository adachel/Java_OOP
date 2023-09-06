package Seminars.Seminar4;

public class Teacher extends User{
    private String objectToTeach;

    public String getObjectToTeach() {return objectToTeach;}
    public void setObjectToTeach(String objectToTeach) {this.objectToTeach = objectToTeach;}

    public Teacher(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public Teacher(String firstName, String secondName, String objectToTeach) {
        super(firstName, secondName);
        this.objectToTeach = objectToTeach;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "objectToTeach='" + objectToTeach + '\'' +
                '}';
    }
}
