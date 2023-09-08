package HomeWorks.HomeWork4;

import java.util.List;

public class TeacherView<T extends Teacher> implements UserView<T> {
    @Override
    public void sendOnConsole(List<T> teachers) {
        for (T teacher: teachers){
            System.out.println(teacher);
        }
    }
}
