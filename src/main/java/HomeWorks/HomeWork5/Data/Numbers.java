package HomeWorks.HomeWork5.Data;

public abstract class Numbers {
    private double realPart;

    public double getRealPart() {return realPart;}

    public Numbers(double value) {
        this.realPart = value;
    }

    public Numbers() {
    }
}
