package Seminars.Seminar7.Task1;

public class LogCalcularor implements Calculable{
//    private int primaryArg;
    private ConsoleLogger consoleLogger;
    private Calculable calculable;

//    public LogCalcularor(int primaryArg) {
//        this.primaryArg = primaryArg;
//    }


    public LogCalcularor(ConsoleLogger consoleLogger, Calculable calculable) {
        this.consoleLogger = consoleLogger;
        this.calculable = calculable;
    }

    @Override
    public Calculable sum(int arg) {
        consoleLogger.printLog("" + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        consoleLogger.printLog("" + arg);
        return calculable.multi(arg);
    }

    @Override
    public int getResult() {
        consoleLogger.printLog("Result");
        return calculable.getResult();
    }
}
