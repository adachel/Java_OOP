package HomeWorks.HomeWork2.Task1;

public class Man extends Alive {
    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }
}
