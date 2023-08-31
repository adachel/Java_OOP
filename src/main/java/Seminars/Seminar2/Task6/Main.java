package Seminars.Seminar2.Task6;

/**
 * Создать класс человек с возможностью ездить и останавливаться на: машине, скейтборде,
 * велосипеде(что будет если расширить список ?).
 */
public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Human human = new Human();
        human.start(car);
        human.finish(car);


        Scate scate = new Scate();
        human.start(scate);
        human.finish(scate);
    }
}
