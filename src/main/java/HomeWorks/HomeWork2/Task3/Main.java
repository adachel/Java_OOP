package HomeWorks.HomeWork2.Task3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор
 * препятствий. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */
public class Main {

    public static void competition(ArrayList<Athlete> athletes, ArrayList<SportsObstacle> sportsObstacles){
        for (Athlete athlete: athletes){
            for (SportsObstacle sportsObstacle: sportsObstacles){
                if (athlete.metodObstacle(sportsObstacle) == 0){
                    athletes.remove(athlete);
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

        ArrayList<SportsObstacle> sportsObstacles = new ArrayList<>(Arrays.asList(new SportsObstacle(2), new SportsObstacle(4)));

        competition(athletes, sportsObstacles);
        System.out.println(athletes);

    }
}
