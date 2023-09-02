package HomeWorks.HomeWork2.Task1;

public class Robot extends Creator {
    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
}
