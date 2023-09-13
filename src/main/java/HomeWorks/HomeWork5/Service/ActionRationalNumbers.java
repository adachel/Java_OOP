package HomeWorks.HomeWork5.Service;

import HomeWorks.HomeWork5.Data.RationalNumber;

public class ActionRationalNumbers implements Action<RationalNumber> {

    @Override
    public String addition(RationalNumber value1, RationalNumber value2) {
        double result = Double.parseDouble(String.valueOf(value1)) +
                        Double.parseDouble(String.valueOf(value2));
        return String.valueOf(result);
    }

    @Override
    public String subtraction(RationalNumber value1, RationalNumber value2) {
        double result = Double.parseDouble(String.valueOf(value1)) -
                Double.parseDouble(String.valueOf(value2));
        return String.valueOf(result);
    }
}
