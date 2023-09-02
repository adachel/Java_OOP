package Seminars.Seminar2;

public class Dog extends Animal {
    String name;

    @Override
    public void animalInfo() {
        System.out.println("Собака");
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгнула");
    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }
}
