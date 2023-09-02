package HomeWorks.HomeWork2.Task3;

import HomeWorks.HomeWork2.Task2.Wall;

public class Athlete {
    private String name;
    private int jamp;

    private int temp;

    public int getTemp() {
        return temp;
    }

//    public void setTemp(int temp) {
//        this.temp = temp;
//    }

    public Athlete(String name, int jamp) {
        this.name = name;
        this.jamp = jamp;
    }
    public Athlete(int jamp) {
        this.jamp = jamp;
    }
    public int metodObstacle(SportsObstacle sportsObstacle){
        if (this.jamp > sportsObstacle.getSizeObstacle()){
            return temp = 1;
        } else return temp = 0;
    }

}
