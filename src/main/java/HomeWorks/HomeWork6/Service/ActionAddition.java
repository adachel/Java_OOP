package HomeWorks.HomeWork6.Service;

import HomeWorks.HomeWork5.Data.RationalNumber;

public interface ActionAddition<T> {
    /**
     * @apiNote Интерфейсный метод сложения
     * @param value1 первое число
     * @param value2 второе число
     * @return результат сложения
     */
    String addition(T value1, T value2);    // todo сложение

}
