package Seminars.Seminar2.Task5;

public class DogTask extends Animals {
    public static final int canRun = 500; // бег: собака — 500 м
    public static final int canSwim = 10; // плавать 10 м
    public static int countDog;
    public DogTask(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void swim(int distance) {
        if (distance > canSwim){
            System.out.println(name + " Не проплыл");
        } else System.out.println(name + " Проплыл " + distance);
    }

    @Override
    public void run(int distance) {
        if (distance > canRun){
            System.out.println(name + " Не пробежал");
        } else System.out.println(name + " Пробежал " + distance);
    }
}
