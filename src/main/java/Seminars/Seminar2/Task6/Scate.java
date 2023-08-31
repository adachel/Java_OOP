package Seminars.Seminar2.Task6;

public class Scate implements Transport {
    @Override
    public void run(){
        System.out.println("Скейт едет");
    }
    @Override
    public void stop(){
        System.out.println("Скейт стоит");
    }
}
