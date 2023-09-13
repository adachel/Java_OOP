package HomeWorks.HomeWork5.Service;

import HomeWorks.HomeWork5.Data.ComplexNumber;

public interface Action<T> {
    String addition(T value1, T value2);    // todo сложение

    String subtraction(T value1, T value2); // todo вычитaние
}
