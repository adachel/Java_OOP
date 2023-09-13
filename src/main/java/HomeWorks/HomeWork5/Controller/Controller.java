package HomeWorks.HomeWork5.Controller;

import HomeWorks.HomeWork5.Data.ComplexNumber;
import HomeWorks.HomeWork5.Data.RationalNumber;
import HomeWorks.HomeWork5.Service.ActionComplexNumbers;
import HomeWorks.HomeWork5.Service.ActionRationalNumbers;
import HomeWorks.HomeWork5.View.ViewResult;

public abstract class Controller {
    ActionRationalNumbers actionRationalNumbers = new ActionRationalNumbers();
    ActionComplexNumbers actionComplexNumbers = new ActionComplexNumbers();
    ViewResult viewResult = new ViewResult();
    InputMethod menuMetod = new InputMethod();


    protected String additionRationalNumbers(RationalNumber value1, RationalNumber value2) {
        return actionRationalNumbers.addition(value1, value2);
    }
    protected void viewAdditionRationalNumbers(RationalNumber value1, RationalNumber value2) {
        viewResult.addition(additionRationalNumbers(value1, value2));
    }

    protected String subtractionRationalNumbers(RationalNumber value1, RationalNumber value2) {
        return actionRationalNumbers.subtraction(value1, value2);
    }
    protected void viewSubtractionRationalNumbers(RationalNumber value1, RationalNumber value2) {
        viewResult.subtraction(subtractionRationalNumbers(value1, value2));
    }
    protected String additionComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        return actionComplexNumbers.addition(number1, number2);
    }
    protected void viewAdditionComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        viewResult.addition(additionComplexNumbers(number1, number2));
    }
    protected String subtractionComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        return actionComplexNumbers.subtraction(number1, number2);
    }
    protected void viewSubtractionComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        viewResult.subtraction(subtractionComplexNumbers(number1, number2));
    }
}


