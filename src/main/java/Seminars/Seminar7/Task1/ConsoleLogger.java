package Seminars.Seminar7.Task1;

public class ConsoleLogger implements Logable{
    @Override
    public void printLog(String massage) {
        System.out.println("Log " + massage);
    }
}
