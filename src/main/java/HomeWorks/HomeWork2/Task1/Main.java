package HomeWorks.HomeWork2.Task1;
/**
 * Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса, но есть общий класс родитель.
 * Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
 */
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.run();
        robot.jump();

        Cat cat = new Cat();
        cat.run();
        cat.jump();

        Man man = new Man();
        man.run();
        man.jump();

    }
}
