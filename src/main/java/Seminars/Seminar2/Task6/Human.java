package Seminars.Seminar2.Task6;

public class Human {
    private Transport currentTrasport;
//    private Car lastCar;
//    public void startCar(Car car) {
//        if (lastCar == null){
//            car.run();
//            lastCar = car;
//        } else System.out.println("уже едет");
//
//    }
//    public void finishCar(Car car) {
//        if (lastCar != null){
//            car.stop();
//            lastCar = null;
//        } else System.out.println("уже стоит");
//    }

    public void start(Transport trasport) {
        if (currentTrasport == null){
            trasport.run();
            currentTrasport = trasport;
        } else System.out.println("уже едет");

    }

    public void finish(Transport trasport) {
        if (currentTrasport != null){
            trasport.stop();
            currentTrasport = null;
        } else System.out.println("уже стоит");
    }
}
