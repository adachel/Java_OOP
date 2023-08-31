package Seminars.Seminar2.Task5;

import Seminars.Seminar2.Cat;

public class HomeCat extends CatTask {
    public static int countHomeCat;
    public HomeCat(String name) {
        super(name);
        countHomeCat++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " Коты не плавают");
    }

    @Override
    public void run(int distance) {
        if (distance > canRun){
            System.out.println(name + " Не пробежал");
        } else System.out.println(name + " Пробежал " + distance);
    }
}
