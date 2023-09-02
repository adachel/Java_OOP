package HomeWorks.HomeWork2.Task3;

public class SportsObstacle {
    private int sizeObstacle;
    public int getSizeObstacle() {
        return sizeObstacle;
    }
    public SportsObstacle(int sizeObstacle) {
        this.sizeObstacle = sizeObstacle;
    }

    @Override
    public String toString() {
        return "Высота препятствия " + sizeObstacle;
    }
}
