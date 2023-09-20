package HomeWorks.HomeWork7final.Model.Funcs;

public interface Calculable<T> {

    T sum(T number1, T number2);
    T subtraction(T number1, T number2);
    T multi(T number1, T number2);
    T divide(T number1, T number2);
    T getResult();
}
