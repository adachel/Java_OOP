package Seminars.Seminar4;

import java.util.List;

public interface UserService<T> {
    public List<T> getAll();

    void creat(String firstName, String secondName, int score, int age);
    // в 'interface' 'public' можно не писaть


}