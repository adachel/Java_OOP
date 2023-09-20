package Seminars.Seminar7.Task1;

public class LogCalculableFactory implements ICalculableFactory{
    private ConsoleLogger consoleLogger;

    public LogCalculableFactory(ConsoleLogger consoleLogger) {
        this.consoleLogger = consoleLogger;
    }
    @Override
    public Calculable create(int primaryArg) {
        return new LogCalcularor(consoleLogger, new Calculator(primaryArg));
    }
}
