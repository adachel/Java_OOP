package Seminars.Seminar7.Task1;

// Проект DecoratorFactory: Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
//        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());

        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
