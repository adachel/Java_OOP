package HomeWorks.HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class TeachreService implements UserService<Teacher> {
    private List<Teacher> teachers;

    public TeachreService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List getAll() {
        return teachers;
    }

    @Override
    public void creat() {
    }

    /**
     * @apiNote Метод создания преподавателя
     * @param name имя
     * @param age возраст
     * @param objectToTeach предмет преподавания
     * @param rating рейтинг
     */
    public void creat(String name, int age, String objectToTeach, int rating) {
        Teacher teacher = new Teacher(name, age, objectToTeach, rating);
        teachers.add(teacher);
    }

    @Override
    public void add() {
    }

    /**
     * @apiNote Метод добавления преподавателя
     * @param teacher преподаватель
     */
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void remove() {
    }
    /**
     * @apiNote Метод удаления преподавателя из списка
     * @param teacher преподаватель
     */
    public void remove(Teacher teacher) {
        teachers.remove(teacher);
    }

    @Override
    public void replace() {
    }
    /**
     * @param teacher           преподаватель
     * @param name              имя
     * @param age               возраст
     * @param scienceOfTeaching предмет преподавания
     * @param rating            рейтинг
     * @apiNote Метод изменения данных преподавателя
     */
    public void replace(Teacher teacher, String name, int age, String scienceOfTeaching, int rating) {
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setScienceOfTeaching(scienceOfTeaching);
        teacher.setRating(rating);
    }
    /**
     * @param name              имя
     * @param age               возраст
     * @param scienceOfTeaching предмет преподавания
     * @param rating            рейтинг
     * @apiNote Метод изменения данных преподавателя с поиском по имени
     */
    public void replace(String name, int age, String scienceOfTeaching, int rating) {
        for (int i = 0; i < teachers.size(); i++) {
            if (name.equals(teachers.get(i).getName())) {
                teachers.get(i).setAge(age);
                teachers.get(i).setScienceOfTeaching(scienceOfTeaching);
                teachers.get(i).setRating(rating);
            }
        }
    }
}
