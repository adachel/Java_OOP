package HomeWorks.HomeWork5.Service;

import HomeWorks.HomeWork5.Data.ComplexNumber;

public class ActionComplexNumbers implements Action<ComplexNumber> {

    @Override
    public String addition(ComplexNumber value1, ComplexNumber value2) {
        double realPart = Double.parseDouble(String.valueOf(value1.getRealPart())) +
                Double.parseDouble(String.valueOf(value2.getRealPart()));
        double imaginaryPart = Double.parseDouble(String.valueOf(value1.getImaginaryPart())) +
                Double.parseDouble(String.valueOf(value2.getImaginaryPart()));

        String result = "";
        if (imaginaryPart > 0) {
            result = "{" +  String.valueOf(realPart) + " +" + "i" + "(" + String.valueOf(imaginaryPart) + ")" + "}";
        } else if (imaginaryPart < 0) {
            result = "{" +  String.valueOf(realPart) + " -" + "i" + "(" +
                            String.valueOf(imaginaryPart * -1) + ")" + "}";
        } else result =     String.valueOf(realPart);

        return result;
    }

    public String subtraction(ComplexNumber value1, ComplexNumber value2) {
        double realPart = Double.parseDouble(String.valueOf(value1.getRealPart())) -
                Double.parseDouble(String.valueOf(value2.getRealPart()));
        double imaginaryPart = Double.parseDouble(String.valueOf(value1.getImaginaryPart())) -
                Double.parseDouble(String.valueOf(value2.getImaginaryPart()));

        String result = "";
        if (imaginaryPart > 0) {
            result = "{" +  String.valueOf(realPart) + " +" + "i" + "(" +
                            String.valueOf(imaginaryPart) + ")" + "}";
        } else if (imaginaryPart < 0) {
            result = "{" +  String.valueOf(realPart) + " -" + "i" + "(" +
                            String.valueOf(imaginaryPart * -1) + ")" + "}";
        } else result =     String.valueOf(realPart);

        return result;
    }
}
