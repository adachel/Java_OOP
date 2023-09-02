package Seminars.Seminar2.Task5;

public abstract class CatTask extends Animals {
    public static int countCat;
    public static final int canRun = 200; // бег: кот — 200 м
    public static final int canSwim = 0; // кот — не умеет плавать
    public CatTask(String name) {
        super(name);
        countCat++;
    }

    public abstract void swim(int distance);
    public abstract void run(int distance);


}
