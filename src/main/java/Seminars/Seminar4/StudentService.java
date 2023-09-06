package Seminars.Seminar4;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void creat(String firstName, String secondName, int score, int age) {
        Student student = new Student(firstName, secondName, score, age);
        students.add(student);
    }
}
