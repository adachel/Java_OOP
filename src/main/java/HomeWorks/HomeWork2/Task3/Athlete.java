package HomeWorks.HomeWork2.Task3;

import HomeWorks.HomeWork2.Task2.Wall;

public class Athlete {
    private String name;
    private int jamp;
    private int temp;

    public Athlete(String name, int jamp) {
        this.name = name;
        this.jamp = jamp;
    }
    public Athlete(int jamp) {
        this.jamp = jamp;
    }

    /**
     * @apiNote Метод сравнения прыжка участника и высоты препятствия
     * @param sportsObstacle Высота препятствия
     * @return "0" - препятствие веше, "1" - препятсвие ниже
     */
    public int metodObstacle(SportsObstacle sportsObstacle){
        if (this.jamp <= sportsObstacle.getSizeObstacle()){
            return temp = 0;
        } else return temp = 1;
    }


    @Override
    public String toString() {
        return "Участник " + name + " прыжок= " + jamp;
    }
}
