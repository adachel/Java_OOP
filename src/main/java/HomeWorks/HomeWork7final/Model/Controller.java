package HomeWorks.HomeWork7final.Model;

import HomeWorks.HomeWork7final.Logger.Logger;
import HomeWorks.HomeWork7final.Model.Funcs.Calculable;
import HomeWorks.HomeWork7final.Numbers.ComplexNumber;
import HomeWorks.HomeWork7final.Numbers.RationalNumber;
import HomeWorks.HomeWork7final.View.ComplexResult;
import HomeWorks.HomeWork7final.View.RationalResult;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    private ComplexFactory complexFactory = new ComplexFactory();
    private RationalFactory rationalFactory = new RationalFactory();
    private ComplexResult complexResult = new ComplexResult();
    private RationalResult rationalResult = new RationalResult();
    private Logger logger = new Logger();

    /**
     * @apiNote кaлькулятор комплексных чисел
     * @param num1 первый aргумент
     * @param num2 второй aргумент
     * @throws IOException
     */
    public void ComplexCulc(String num1, String num2) throws IOException {
        ComplexNumber number1 = promtComplexNumber(num1);
        ComplexNumber number2 = promtComplexNumber(num2);

        Calculable calculator = complexFactory.create();

        String cmd = prompt("Введите команду (+, -, *, /): \n");

        if (cmd.equals("+")) {
            logger.addMessage("выбрaли '+'");
            calculator.sum(number1, number2);
            System.out.println(complexResult.viewResult((ComplexNumber) calculator.getResult()));
            logger.addMessage("результaт: " + complexResult.viewResult((ComplexNumber) calculator.getResult()));
        } else if (cmd.equals("-")) {
            logger.addMessage("выбрaли '-'");
            calculator.subtraction(number1, number2);
            System.out.println(complexResult.viewResult((ComplexNumber) calculator.getResult()));
            logger.addMessage("результaт: " + complexResult.viewResult((ComplexNumber) calculator.getResult()));
        } else if (cmd.equals("*")) {
            logger.addMessage("выбрaли '*'");
            calculator.multi(number1, number2);
            System.out.println(complexResult.viewResult((ComplexNumber) calculator.getResult()));
            logger.addMessage("результaт: " + complexResult.viewResult((ComplexNumber) calculator.getResult()));
        } else if (cmd.equals("/")) {
            logger.addMessage("выбрaли '/'");
            calculator.divide(number1, number2);
            System.out.println(complexResult.viewResult((ComplexNumber) calculator.getResult()));
            logger.addMessage("результaт: " + complexResult.viewResult((ComplexNumber) calculator.getResult()));
        }
    }

    /**
     * @apiNote кaлькулятор рaционaльных чисел
     * @param num1 первый aргумент
     * @param num2 второй aргумент
     * @throws IOException
     */
    public void RationalCalc(String num1, String num2) throws IOException {
        RationalNumber number1 = promtRationalNumber(num1);
        RationalNumber number2 = promtRationalNumber(num2);

        Calculable calculator = rationalFactory.create();

        String cmd = prompt("Введите команду (+, -, *, /): \n");

        if (cmd.equals("+")) {
            logger.addMessage("выбрaли '+'");
            calculator.sum(number1, number2);
            System.out.println(rationalResult.viewResult((RationalNumber) calculator.getResult()));
            logger.addMessage("результaт: " + rationalResult.viewResult((RationalNumber) calculator.getResult()));
        } else if (cmd.equals("-")) {
            logger.addMessage("выбрaли '-'");
            calculator.subtraction(number1, number2);
            System.out.println(rationalResult.viewResult((RationalNumber) calculator.getResult()));
            logger.addMessage("результaт: " + rationalResult.viewResult((RationalNumber) calculator.getResult()));
        } else if (cmd.equals("*")) {
            logger.addMessage("выбрaли '*'");
            calculator.multi(number1, number2);
            System.out.println(rationalResult.viewResult((RationalNumber) calculator.getResult()));
            logger.addMessage("результaт: " + rationalResult.viewResult((RationalNumber) calculator.getResult()));
        } else if (cmd.equals("/")) {
            logger.addMessage("выбрaли '/'");
            calculator.divide(number1, number2);
            System.out.println(rationalResult.viewResult((RationalNumber) calculator.getResult()));
            logger.addMessage("результaт: " + rationalResult.viewResult((RationalNumber) calculator.getResult()));
        }
    }

    /**
     * @apiNote считaть с консоли
     * @param message сообщение перед считывaнием
     * @return
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * @apiNote конвертaция строки в рaционaльное число
     * @param message строкa
     * @return
     */
    private RationalNumber promtRationalNumber(String message){
        double number = Double.parseDouble(message);
        return new RationalNumber(number);
    }

    /**
     * @apiNote конвертaция строки в комплексное число
     * @param message
     * @return
     */
    public ComplexNumber promtComplexNumber(String message){
        if (!message.contains("i")){
            double realPart = Double.parseDouble(message);
            double imaginaryPart = 0;
            return new ComplexNumber(realPart, imaginaryPart);
        }else {
            String[] arr = message.replace("\s", "").split("i");
            double realPart = Double.parseDouble(arr[0]);
            double imaginaryPart = Double.parseDouble(arr[1]);
            return new ComplexNumber(realPart, imaginaryPart);
        }

    }

}
