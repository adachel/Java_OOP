package HomeWorks.HomeWork6.Data;

public class RationalNumber extends Numbers {
    public RationalNumber(double realPart) {
        super(realPart);
    }


    @Override
    public String toString() {
        return "" + getRealPart();
    }
}
