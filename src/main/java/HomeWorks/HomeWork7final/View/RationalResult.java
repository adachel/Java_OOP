package HomeWorks.HomeWork7final.View;

import HomeWorks.HomeWork7final.Numbers.RationalNumber;

public class RationalResult implements Resultable<RationalNumber> {

    @Override
    public String viewResult(RationalNumber result) {
        String res = "";
        res = ("Результaт число: " + result.getRealPart());
        return res;
    }
}
