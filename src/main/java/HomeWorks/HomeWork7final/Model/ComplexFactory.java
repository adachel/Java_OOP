package HomeWorks.HomeWork7final.Model;

import HomeWorks.HomeWork7final.Model.Funcs.Calculable;
import HomeWorks.HomeWork7final.Model.Funcs.ComplexCalculator;

public class ComplexFactory implements ICalculableFactory {

    @Override
    public Calculable create() {
        return new ComplexCalculator();
    }
}
