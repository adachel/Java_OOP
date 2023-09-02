package Lections.Lection1.Incapsulacia;

/**
 * Инкапсуляция – это свойство системы, позволяющее объединить данные и методы, работающие
 * с ними в классе, скрыв детали реализации и защитив от пользователя этого класса объектов.
 */
public class Programm {
    public static void main(String[] args) {
//        Robot robot1 = new Robot("Robert", 1);
//        System.out.printf("Имя: %s; Уровень: %d\n", robot1.name, robot1.level);// 'name' и 'level' закрыты даже с геттерами
//        System.out.printf("Имя: %s; Уровень: %d\n", robot1.getName(), robot1.getLevel());

//        robot1.startBIOS();
//        robot1.startOS();
//        robot1.sayHi();
//        robot1.powerOn();
//
//        robot1.Working();
//        robot1.Working();
//        robot1.Working();

//        robot1.sayBye();
//        robot1.StopOS();
//        robot1.stopBIOS();
//        robot1.powerOFF();

//        System.out.println(robot1);

//        robot1.level = 145000; // изменили 'level' в клиентском коде (это плохо) // 'level' закрыт для изменения
//        System.out.printf("Имя: %s; Уровень: %d\n", robot1.name, robot1.level);

        RobotBetter robot2 = new RobotBetter("QWERTY");
        System.out.println("_______________");
        System.out.println(robot2);
        robot2.power();
        robot2.work();
        robot2.power();
        robot2.work();


        System.out.println(robot2);

    }
}
