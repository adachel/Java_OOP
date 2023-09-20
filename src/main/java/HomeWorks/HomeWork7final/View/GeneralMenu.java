package HomeWorks.HomeWork7final.View;

import HomeWorks.HomeWork7final.Logger.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class GeneralMenu {
    Logger logger = new Logger();
    public void run() throws IOException {
        logger.cleanFileLog();
        boolean temp = true;
        while (temp){
            System.out.println("Выберите: 1 - Кaлькулятор, 2 - Просмотр лог-фaйлa, 0 - Выход");

            switch (input()){
                case "0" -> temp = false;
                case "1" -> {CalculatorMenu calculatorMenu = new CalculatorMenu();
                            logger.addMessage("Кaлькулятор");
                            calculatorMenu.runMemu();
                }
                case "2" -> {
                    logger.addMessage("Просмотр логов.");
                    String logs = Files.readString(logger.creatMessage());
                    System.out.println(logs);
                }
                default -> {
                    System.out.println("Введите корректный выбор");
                    logger.addMessage("Не корректный выбор");
                }
            }
        }
    }
    private String input() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}

