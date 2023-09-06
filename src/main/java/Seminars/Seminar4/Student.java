package Seminars.Seminar4;

public class Student extends User {
    private int score;
    private int age;

    public int getScore() {return score;}
    public void setScore(int score) {this.score = score;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public Student(String firstName, String secondName, int score, int age) {
        super(firstName, secondName);
        this.score = score;
        this.age = age;
    }

    public Student(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    public String toString() {
        return "Student " + super.getFirstName()+ " {" +
                "score=" + score +
                ", age=" + age +
                '}';
    }
}
