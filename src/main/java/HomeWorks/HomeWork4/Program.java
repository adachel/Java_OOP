package HomeWorks.HomeWork4;

import java.util.ArrayList;
import java.util.List;

/**
 * — Создать класс УчительКомпаратор по некоторому числовому параметру, типизировать его.
 *
 * — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре для Студента,
 *   и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей,
 *   имеющихся в системе.
 *
 * — Создать класс УчительВью и реализовать аналогично проделанному на семинаре для Студентов;
 *
 * Формат сдачи: ссылка на гитхаб проект
 */
public class Program {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Barbara", 25, "Math", 5);
        Teacher teacher2 = new Teacher("Nika", 35, "Chemistry", 6);
        Teacher teacher3 = new Teacher("Victoria", 45, "Physics ", 2);
        Teacher teacher4 = new Teacher("Helly", 15, "Geography", 9);
        Teacher teacher5 = new Teacher("Boris", 75, "Geometry", 4);

        TeachreService listTeachers = new TeachreService();
        listTeachers.creat("Елена", 67, "Химия", 23);
        listTeachers.add(teacher1);
        listTeachers.add(teacher2);
        listTeachers.add(teacher3);
        listTeachers.add(teacher4);
        listTeachers.add(teacher5);


        TeacherView send = new TeacherView();
        send.sendOnConsole(listTeachers.getAll());
        System.out.println();

        listTeachers.replace("Елена", 37, "Физика", 13);

        listTeachers.getAll().sort(new TeacherComparatorAge());
        send.sendOnConsole(listTeachers.getAll());
        System.out.println();

        listTeachers.getAll().sort(new TaecherComparatorRating());
        send.sendOnConsole(listTeachers.getAll());
        System.out.println();

        listTeachers.remove(teacher5);
        send.sendOnConsole(listTeachers.getAll());
    }
}
