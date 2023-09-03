package HomeWorks.HomeWork2.Task2;
/**
 * Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
 * соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
 * (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина (для дорожки)
 * или высота (для стены), а участников ограничения на бег и прыжки.
 */
public class Main {
    public static void main(String[] args) {

        Treadmill treadmill1 = new Treadmill(400); // todo беговая дорожка

        Wall wall1 = new Wall(5); // todo стена

        Athlete men1 = new Athlete("Иван", 500, 2);
        men1.metodRun(treadmill1);
        men1.metodJump(wall1);

        Athlete men2 = new Athlete("Петр", 300, 6);
        men2.metodRun(treadmill1);
        men2.metodJump(wall1);
    }
}
