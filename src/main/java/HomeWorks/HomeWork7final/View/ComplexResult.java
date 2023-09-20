package HomeWorks.HomeWork7final.View;

import HomeWorks.HomeWork7final.Numbers.ComplexNumber;

public class ComplexResult implements Resultable<ComplexNumber> {
    @Override
    public String viewResult(ComplexNumber result) {
        String res = "";
        if (result.getImaginaryPart() < 0){
            res = "Результaт число {" +    result.getRealPart() + "-" + "i" + (result.getImaginaryPart() * -1) + "}";
        } else if (result.getImaginaryPart() == 0) {
            res = "Результaт число {" +    result.getRealPart() + "}";
        } else if (result.getImaginaryPart() > 0) {
            res = "Результaт число {" +    result.getRealPart() + "+" + "i" + result.getImaginaryPart() + "}";
        }
        return res;
    }
}
