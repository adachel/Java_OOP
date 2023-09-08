package Seminars.Seminar4;

import java.util.List;

public class StudentView<T extends Student> implements UserView<T> { // вывод в консоль

    public void sendOnConsole(List<T> students) {
        for (T user: students){
            System.out.println(user);
        }
    }
}
