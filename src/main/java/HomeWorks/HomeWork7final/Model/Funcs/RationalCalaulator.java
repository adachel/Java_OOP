package HomeWorks.HomeWork7final.Model.Funcs;

import HomeWorks.HomeWork7final.Numbers.RationalNumber;

public class RationalCalaulator implements Calculable<RationalNumber> {
    RationalNumber rationalNumber;

    public RationalCalaulator() {
        this.rationalNumber = rationalNumber;
    }

    @Override
    public RationalNumber sum(RationalNumber number1, RationalNumber number2) {
        double res = number1.getRealPart() + number2.getRealPart();
        return this.rationalNumber = new RationalNumber(res);
    }

    @Override
    public RationalNumber subtraction(RationalNumber number1, RationalNumber number2) {
        double res = number1.getRealPart() - number2.getRealPart();
        return this.rationalNumber = new RationalNumber(res);
    }

    @Override
    public RationalNumber multi(RationalNumber number1, RationalNumber number2) {
        double res = number1.getRealPart() * number2.getRealPart();
        return this.rationalNumber = new RationalNumber(res);
    }

    @Override
    public RationalNumber divide(RationalNumber number1, RationalNumber number2) {
        double res = number1.getRealPart() / number2.getRealPart();
        return this.rationalNumber = new RationalNumber(res);
    }

    @Override
    public RationalNumber getResult() {
        return rationalNumber;
    }
}
