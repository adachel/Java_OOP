package HomeWorks.HomeWork7final.Model.Funcs;
// Сложение: (a1 + ib1) + (a2 + ib2) = (a1 + a2) + i(b1 + b2)

// Вычитaние: (a1 + ib1) - (a2 + ib2) = (a1 - a2) + i(b1 - b2)

// Умножение: (a1 + ib1) * (a2 + ib2) = (a1 * a2 - b1 * b2) + i(a1 * b2 + a2 * b1)

// Деление: (a1 + ib1) * (a2 + ib2) = ((a1 * a2 + b1 * b2) / (a2 ^ 2 + b2 ^ 2)) + i((b1 * a2 - a1 * b2) / (a2 ^ 2 + b2 ^ 2))

import HomeWorks.HomeWork7final.Numbers.ComplexNumber;

public class ComplexCalculator implements Calculable<ComplexNumber> {
    ComplexNumber complexNumber;
    public ComplexCalculator() {
        this.complexNumber = complexNumber;
    }
    @Override
    public ComplexNumber sum(ComplexNumber number1, ComplexNumber number2) {
        double a1 = number1.getRealPart();
        double b1 = number1.getImaginaryPart();
        double a2 = number2.getRealPart();
        double b2 = number2.getImaginaryPart();
        double realPart = a1 + a2;
        double imaginaryPart = b1 + b2;
        return this.complexNumber = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber number1, ComplexNumber number2) {
        double a1 = number1.getRealPart();
        double b1 = number1.getImaginaryPart();
        double a2 = number2.getRealPart();
        double b2 = number2.getImaginaryPart();
        double realPart = a1 - a2;
        double imaginaryPart = b1 - b2;
        return this.complexNumber = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber multi(ComplexNumber number1, ComplexNumber number2) {
        double a1 = number1.getRealPart();
        double b1 = number1.getImaginaryPart();
        double a2 = number2.getRealPart();
        double b2 = number2.getImaginaryPart();
        double realPart = (a1 * a2 - b1 * b2);
        double imaginaryPart = (a1 * b2 + a2 * b1);
        return this.complexNumber = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        double a1 = number1.getRealPart();
        double b1 = number1.getImaginaryPart();
        double a2 = number2.getRealPart();
        double b2 = number2.getImaginaryPart();
        double realPart = ((a1 * a2 + b1 * b2) / (a2 * a2 + b2 * b2));
        double imaginaryPart = ((b1 * a2 - a1 * b2) / (a2 * a2 + b2 * b2));
        return this.complexNumber = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber getResult() {
        return complexNumber;
    }


    @Override
    public String toString() {
        return "ComplexCalculator{" +
                "complexNumber=" + complexNumber +
                '}';
    }
}
