package HomeWorks.HomeWork7final.Numbers;

public class ComplexNumber extends Numbers {
    private double imaginaryPart;
    public ComplexNumber(double realPart, double imaginaryPart) {
        super(realPart);
        this.imaginaryPart = imaginaryPart;
    }
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    @Override
    public String toString() {
        return "complexNumber{" + super.getRealPart() + " " + "+" + " " + "i" + "(" + imaginaryPart + ")" + '}';
    }
}
