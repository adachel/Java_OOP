package Seminars.Seminar2.Task6;

public class Car implements Transport {
    @Override
    public void run(){
        System.out.println("Машина едет");
    }
    @Override
    public void stop(){System.out.println("Машина стоит");}
}
