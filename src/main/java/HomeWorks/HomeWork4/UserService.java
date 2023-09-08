package HomeWorks.HomeWork4;

import java.util.List;

public interface UserService<T> {
    List<T> getAll();

    void creat();

    void add();

    void replace();

    void remove();
}
