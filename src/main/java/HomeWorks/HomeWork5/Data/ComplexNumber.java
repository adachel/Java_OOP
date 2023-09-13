package HomeWorks.HomeWork5.Data;

public class ComplexNumber extends Numbers {
    private double imaginaryPart;

    public double getImaginaryPart() { return imaginaryPart; }
    public ComplexNumber(double realPart, double imaginaryPart) {
        super(realPart);
        this.imaginaryPart = imaginaryPart;
    }


    @Override
    public String toString() {
        if (imaginaryPart > 0) {
            return "Число{" + getRealPart() + " +" + "i" + imaginaryPart + "}";
        } else if (imaginaryPart < 0) {return "Число{" + getRealPart() + " -" + "i" + imaginaryPart + "}";
        } else return "" + getRealPart();
    }
}
