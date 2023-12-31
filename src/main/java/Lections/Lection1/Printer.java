package Lections.Lection1;

/**
 * Правильное планирование – реализация только после абстракций
 * Абстракция – что делает?
 * Поведение – как делает?
 * Спецификация – набор правил, описывающих API
 */

/**
 * Класс.
 * Класс – это «чертеж» (описание) сущности предметной области, позволяющий выделить
 * некоторые общие характеристики, состояние и поведение, зависящее от состояния.
 *
 * Предметная область — множество всех предметов (явлений) решаемой проблемы.
 */

/**
 * Экземпляр класса.
 * Экземпляр класса – отдельный представитель класса, имеющий КОНКРЕТНОЕ состояние
 * и поведение, которое полностью определяется описанием класса.
 *
 * Состояние – набор данных (полей, атрибутов, членов класса).
 *
 * Поведение – функции для работы с данными и выполнения полезной работы.
 */

/**
 * Экземпляр класса:
 * Состояния
 * - Поля
 * - Константы
 * - События
 *
 * Поведение:
 * - Конструкторы
 * - Методы
 */

/**
 * Инкапсуляция – это свойство системы, позволяющее объединить данные и методы, работающие
 * с ними в классе, скрыв детали реализации и защитив от пользователя этого класса объектов.
 */

/**
 *
 */



public class Printer {

    static Double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 4); // создали экземпляр класса - точка 'a'.
//        a.x = 0; // координты точки 'a'.
//        a.y = 2;
//        System.out.println(a.toString());
        System.out.println(a.getInfo()); // корректный вывод

        Point2D b = new Point2D(0, 10);
//        b.x = 0;
//        b.y = 10;
//        System.out.println(b.toString());
        System.out.println(b); // после переопределения метода выводит корректно

        System.out.println(distance(a, b));
    }
}
