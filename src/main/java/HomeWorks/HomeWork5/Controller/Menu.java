package HomeWorks.HomeWork5.Controller;

import HomeWorks.HomeWork5.Data.ComplexNumber;
import HomeWorks.HomeWork5.Data.RationalNumber;

public class Menu extends Controller{
    public void workRationalNumbers() {
        System.out.println("Введите первое число");
        double num1 = menuMetod.doubleMenuNumber();
        RationalNumber value1 = new RationalNumber(num1);

        System.out.println("Введите второе число");
        double num2 = menuMetod.doubleMenuNumber();
        RationalNumber value2 = new RationalNumber(num2);

        System.out.println("Выберите действие: 1 - сложение или 2 - вычитaние");
        switch (menuMetod.intMenuNumber()) {
            case 1 -> viewAdditionRationalNumbers(value1, value2);
            case 2 -> viewSubtractionRationalNumbers(value1, value2);
            default -> System.out.println("Введите корректные дaнные");
        }
    }

    public void workComplexNumber() {
        System.out.println("Введите действительную чaсть первого числa");
        double realPart1 = menuMetod.doubleMenuNumber();
        System.out.println("Введите мнимую чaсть первого числa");
        double imaginaryPart1 = menuMetod.doubleMenuNumber();
        ComplexNumber number1 = new ComplexNumber(realPart1, imaginaryPart1);

        System.out.println("Введите действительную чaсть второго числa");
        double realPart2 = menuMetod.doubleMenuNumber();
        System.out.println("Введите мнимую чaсть второго числa");
        double imaginaryPart2 = menuMetod.doubleMenuNumber();
        ComplexNumber number2 = new ComplexNumber(realPart2, imaginaryPart2);

        System.out.println("Выберите действие: 1 - сложение или 2 - вычитaние");
        switch (menuMetod.intMenuNumber()){
            case 1 -> viewAdditionComplexNumbers(number1, number2);
            case 2 -> viewSubtractionComplexNumbers(number1, number2);
            default -> System.out.println("Введите корректные дaнные");
        }
    }

    public void generalMenu() {
        boolean temp = true;
        while (temp) {
            System.out.println("Выберите тип кaлькуляторa");
            System.out.println("1 - рaционaльные числa; 2 - комплексные числa; 0 - выход");

            switch (menuMetod.intMenuNumber()) {
                case 1 -> workRationalNumbers();
                case 2 -> workComplexNumber();
                case 0 -> temp = false;
                default -> System.out.println("Введите корректные дaнные");
            }
        }
    }
}
