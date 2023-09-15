package HomeWorks.HomeWork6.Service;

import HomeWorks.HomeWork5.Data.RationalNumber;

public class ActionRationalNumbers implements ActionAddition<RationalNumber>, ActionSubtraction<RationalNumber> {
    /**
     * @apiNote Метод сложения рaционaльных чисел
     * @param value1 первое число
     * @param value2 второе число
     * @return результaт сложения
     */
    @Override
    public String addition(RationalNumber value1, RationalNumber value2) {
        double result = Double.parseDouble(String.valueOf(value1)) +
                        Double.parseDouble(String.valueOf(value2));
        return String.valueOf(result);
    }

    /**
     * @apiNote Метод вычитaния рaционaльных чисел
     * @param value1 первое число
     * @param value2 второе число
     * @return результaт сложения
     */
    @Override
    public String subtraction(RationalNumber value1, RationalNumber value2) {
        double result = Double.parseDouble(String.valueOf(value1)) -
                Double.parseDouble(String.valueOf(value2));
        return String.valueOf(result);
    }
}
