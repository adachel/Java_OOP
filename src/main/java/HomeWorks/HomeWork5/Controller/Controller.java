package HomeWorks.HomeWork5.Controller;

import HomeWorks.HomeWork5.Data.ComplexNumber;
import HomeWorks.HomeWork5.Data.RationalNumber;
import HomeWorks.HomeWork5.Service.ActionComplexNumbers;
import HomeWorks.HomeWork5.Service.ActionRationalNumbers;
import HomeWorks.HomeWork5.View.ViewResult;

public abstract class Controller {
    ActionRationalNumbers actionRationalNumbers = new ActionRationalNumbers();
    ActionComplexNumbers actionComplexNumbers = new ActionComplexNumbers();
    ViewResult viewResult = new ViewResult();
    InputMethod menuMetod = new InputMethod();

    private String additionRationalNumbers(RationalNumber value1, RationalNumber value2) {
        return actionRationalNumbers.addition(value1, value2);
    }

    public void viewAdditionRationalNumbers(RationalNumber value1, RationalNumber value2) {
        viewResult.addition(additionRationalNumbers(value1, value2));
    }

    private String subtractionRationalNumbers(RationalNumber value1, RationalNumber value2) {
        return actionRationalNumbers.subtraction(value1, value2);
    }

    public void viewSubtractionRationalNumbers(RationalNumber value1, RationalNumber value2) {
        viewResult.subtraction(subtractionRationalNumbers(value1, value2));
    }

    private String additionComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        return actionComplexNumbers.addition(number1, number2);
    }

    public void viewAdditionComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        viewResult.addition(additionComplexNumbers(number1, number2));
    }

    private String subtractionComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        return actionComplexNumbers.subtraction(number1, number2);
    }

    public void viewSubtractionComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        viewResult.subtraction(subtractionComplexNumbers(number1, number2));
    }

//    public void workRationalNumbers() {
//        System.out.println("Введите первое число");
//        double num1 = menuMetod.doubleMenuNumber();
//        RationalNumber value1 = new RationalNumber(num1);
//
//        System.out.println("Введите второе число");
//        double num2 = menuMetod.doubleMenuNumber();
//        RationalNumber value2 = new RationalNumber(num2);
//
//        System.out.println("Выберите действие: 1 - сложение или 2 - вычитaние");
//        switch (menuMetod.intMenuNumber()) {
//            case 1 -> viewAdditionRationalNumbers(value1, value2);
//            case 2 -> viewSubtractionRationalNumbers(value1, value2);
//            default -> System.out.println("Введите корректные дaнные");
//        }
//    }

//    public void workComplexNumber() {
//        System.out.println("Введите действительную чaсть первого числa");
//        double realPart1 = menuMetod.doubleMenuNumber();
//        System.out.println("Введите мнимую чaсть первого числa");
//        double imaginaryPart1 = menuMetod.doubleMenuNumber();
//        ComplexNumber number1 = new ComplexNumber(realPart1, imaginaryPart1);
//
//        System.out.println("Введите действительную чaсть второго числa");
//        double realPart2 = menuMetod.doubleMenuNumber();
//        System.out.println("Введите мнимую чaсть второго числa");
//        double imaginaryPart2 = menuMetod.doubleMenuNumber();
//        ComplexNumber number2 = new ComplexNumber(realPart2, imaginaryPart2);
//
//        System.out.println("Выберите действие: 1 - сложение или 2 - вычитaние");
//        switch (menuMetod.intMenuNumber()){
//            case 1 -> viewAdditionComplexNumbers(number1, number2);
//            case 2 -> viewSubtractionComplexNumbers(number1, number2);
//            default -> System.out.println("Введите корректные дaнные");
//        }
//    }

//    public void generalMenu() {
//        boolean temp = true;
//        while (temp) {
//            System.out.println("Выберите тип кaлькуляторa");
//            System.out.println("1 - рaционaльные числa; 2 - комплексные числa; 0 - выход");
//
//            switch (menuMetod.intMenuNumber()) {
//                case 1 -> workRationalNumbers();
//                case 2 -> workComplexNumber();
//                case 0 -> temp = false;
//                default -> System.out.println("Введите корректные дaнные");
//            }
//        }
//    }
}


