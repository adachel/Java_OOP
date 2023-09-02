package HomeWorks.HomeWork2.Task2;

public class Athlete {
    private final String name;
    private int run;
    private int jump;

    public Athlete(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    public Athlete(String name) {
        this.name = name;
    }

    /**
     * @apiNote Метод сравнения длины беговой дорожки и запаса хода участника
     * @param treadmill Длина беговой дорожки
     */
    public void metodRun(Treadmill treadmill) {
        if (this.run < treadmill.getLength()){
            System.out.println("Участник " + name + " не смог пробежать");
        } else System.out.println("Участник " + name + " успешно пробежал");
    }

    /**
     * @apiNote Метод сравнения высоты стены и прыжка участника
     * @param wall Высота стены
     */
    public void metodJump(Wall wall) {
        if (this.jump < wall.getHeight()){
            System.out.println("Участник " + name + " не смог перепрыгнуть");
        } else System.out.println("Участник " + name + " успешно перепрыгнул");
    }
}
