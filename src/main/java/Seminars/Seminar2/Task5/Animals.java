package Seminars.Seminar2.Task5;

public abstract class Animals {
    protected String name;
    public static int count; // todo переменная для подсчета животных


    public Animals(String name) {
        this.name = name;
        count++;
    }

    public abstract void swim(int distance);
    public abstract void run(int distance);

}
