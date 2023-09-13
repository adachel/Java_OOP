package HomeWorks.HomeWork5.Data;

public class RationalNumber extends Numbers{
    public RationalNumber(double realPart) {
        super(realPart);
    }


    @Override
    public String toString() {
        return "" + getRealPart();
    }
}
