package HomeWorks.HomeWork7final.Model;

import HomeWorks.HomeWork7final.Model.Funcs.Calculable;
import HomeWorks.HomeWork7final.Model.Funcs.RationalCalaulator;

public class RationalFactory implements ICalculableFactory {
    @Override
    public Calculable create() {
        return new RationalCalaulator();
    }
}
