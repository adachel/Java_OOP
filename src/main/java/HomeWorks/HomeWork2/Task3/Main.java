package HomeWorks.HomeWork2.Task3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор
 * препятствий. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */
public class Main {
    /**
     * @apiNote Метод удаления участников, не прошедших испытания
     * @param athletes Список участников
     * @param sportsObstacles Спаисок препятствий
     */
    public static void competition(ArrayList<Athlete> athletes, ArrayList<SportsObstacle> sportsObstacles){
        for (int i = athletes.size() - 1; i >= 0; i--){
            for (SportsObstacle sportsObstacle: sportsObstacles){
                if (athletes.get(i).metodObstacle(sportsObstacle) == 0){
                    athletes.remove(athletes.get(i));
                }
            }
        }
    }
    public static void main(String[] args) {

        ArrayList<Athlete> athletes = new ArrayList<>(Arrays.asList(new Athlete("Den", 1),
                new Athlete("Ben", 2),
                new Athlete("Ted", 3),
                new Athlete(4),
                new Athlete(5)));

        ArrayList<SportsObstacle> sportsObstacles = new ArrayList<>(Arrays.asList(  new SportsObstacle(1),
                new SportsObstacle(2)));

        System.out.println("Участники: " + athletes);
        System.out.println("Препятствия: " + sportsObstacles);
        competition(athletes, sportsObstacles);
        System.out.println("Оставшиеся участники: " + athletes);
    }
}
