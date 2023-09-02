package Seminars.Seminar2.Task6;

public class Bike implements Transport {
    @Override
    public void run(){
        System.out.println("Велосипед едет");
    }
    @Override
    public void stop(){
        System.out.println("Велосипед стоит");
    }
}
