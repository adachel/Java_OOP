package Seminars.Seminar4;

import java.util.List;

public interface UserService<T> { // вывод в консоль
    public List<T> getAll();

    void creat(String firstName, String secondName, int score, int age);
    // в 'interface' 'public' можно не писaть

}