package Seminars.Seminar2.Task5;

public class Tiger extends CatTask {
    public static final int canTigerRun = 500; // todo для тигра сделали не по заданию
    public static final int canTigerSwim = 100;
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        if (distance > canTigerSwim){
            System.out.println(name + " Не проплыл");
        } else System.out.println(name + " Проплыл " + distance);
    }

    @Override
    public void run(int distance) {
        if (distance > canTigerRun){
            System.out.println(name + " Не пробежал");
        } else System.out.println(name + " Пробежал " + distance);
    }
}
