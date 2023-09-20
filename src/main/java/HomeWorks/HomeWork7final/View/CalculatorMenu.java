package HomeWorks.HomeWork7final.View;

import HomeWorks.HomeWork7final.Logger.Logger;
import HomeWorks.HomeWork7final.Model.Controller;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorMenu {
    Logger logger = new Logger();
    private Controller controller = new Controller();

    public void runMemu() throws IOException {
        System.out.println("Введите первое число: ");
        String num1 = input();
        logger.addMessage("Ввели первое число: " + num1);
        System.out.println("Введите второе число: ");
        String num2 = input();
        logger.addMessage("Ввели второе число: " + num2);
        if (num1.contains("i") || num2.contains("i")){
            logger.addMessage("кaлькулятор для комплексных чисел");
            controller.ComplexCulc(num1, num2);
        }else {
            logger.addMessage("кaлькулятор для рaционaльных чисел");
            controller.RationalCalc(num1, num2);
        }
    }
    private String input() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
