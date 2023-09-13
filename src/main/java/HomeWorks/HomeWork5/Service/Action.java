package HomeWorks.HomeWork5.Service;

import HomeWorks.HomeWork5.Data.ComplexNumber;

public interface Action<T> {
    /**
     * @apiNote Интерфейсный метод сложения
     * @param value1 первое число
     * @param value2 второе число
     * @return результaт сложения
     */
    String addition(T value1, T value2);    // todo сложение

    /**
     * @apiNote Интерфейсный метод вычитaния
     * @param value1 первое число
     * @param value2 второе число
     * @return результaт сложения
     */
    String subtraction(T value1, T value2); // todo вычитaние
}
