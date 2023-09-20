package HomeWorks.HomeWork7final.Numbers;

public abstract class Numbers {
    private final double realPart; // действительнaя чaсть числa

    public Numbers(double realPart) {
        this.realPart = realPart;
    }
    public double getRealPart() {
        return realPart;
    }
}
