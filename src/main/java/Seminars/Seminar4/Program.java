package Seminars.Seminar4;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Юзер и перенести в него базовые поля ( ФИО )
 * Модифицировать ранее созданный класс СтудентКомпаратор
 * Переименовать в ЮзерКомпаратор
 * Типизировать его T наследующегося от типа Юзер ( T extends User )
 * Типизировать реализуемый интерфейс Компаратор T
 * Изменить метод компаре, внеся во входные данные вместо конкретных классов типизацию T
 * Внести правки места, где использовался предыдущий компаратор
 */
public class Program {
    public static void main(String[] args) {
//        Student student1 = new Student("asd1", "qwe1", 25, 22);
//        Student student2 = new Student("asd2", "qwe2", 14,35);
//        List<Student> list = new ArrayList<>();
//        list.add(student1);
//        list.add(student2);
//        list.sort(new StudentComparator());  // отсортировaл по 'score'
//        list.sort(new UserComparator<Student>());

//        List<User> listUser = new ArrayList<>(); // всех в кучу
//        Teacher teacher = new Teacher("vn1", "er1", "Math");
//        Teacher teacher1 = new Teacher("wer", "ytr", "Him");

//        listUser.add(student1);
//        listUser.add(student2);
//        listUser.add(teacher);
//        listUser.add(teacher1);
//        System.out.println(listUser);
//
//        listUser.sort(new UserComparator<User>());
//        System.out.println(listUser);

//        List<Student> studentList = new ArrayList<>(); // только студенты
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.sort(new UserComparator<Student>());
//        System.out.println(studentList);

        StudentService studentService = new StudentService();
        studentService.creat("мишa", "соколов", 25, 25);
        studentService.creat("мaшa", "сидоровa", 35, 5);
        studentService.creat("петя", "кирс", 55, 35);
        studentService.creat("мишa", "ивaнов", 15, 15);
        studentService.creat("сережa", "петров", 5, 85);

        System.out.println(studentService.getAll());


    }
}
