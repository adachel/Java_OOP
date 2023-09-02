package Seminars.Seminar2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Когда член класса объявлен как static (статический), он доступен до создания каких-либо объектов его класса
 * и без ссылки на какой-либо объект. Статическими могут быть объявлены как методы, так и переменные.
 *
 * Переменные экземпляров, объявленные как static, по существу являются глобальными переменными.
 * При объявлении объектов их класса программа не создает никаких копий переменной static.
 * Вместо этого все экземпляры класса совместно используют одну и ту же статическую переменную.
 *
 * На методы, объявленные как static, накладывается ряд ограничений.
 *      Они могут вызывать только другие статические методы.
 *      Они должны осуществлять доступ только к статическим переменным.
 *      Они ни коим образом не могут ссылаться на члены типа this или super. (Ключевое слово super связано
 *      с наследованием и описывается в следующей главе.)
 *
 *
 * Ключевое слово – final. Оно может применяться к классам, методам, переменным (в том числе аргументам методов).
 * Для класса это означает, что класс не умеет иметь подклассов, т.е. запретил расследование.
 * Следует также отметить, что к абстрактным классам (с ключевым словом abstract), нельзя применять
 * модификатор final, т.к. это взаимоисключающие понятия. Для метода final означает, что его нельзя
 * переопределить в подклассах. Это полезно, когда мы хотим, чтобы исходную доставку можно было переопределить.
 *
 * Для принципа примитивного типа это означает, что первоначальное значение не может быть изменено.
 * Для ссылочных вызовов это означает, что после определения объекта нельзя изменить ссылку на данный объект.
 * Это важно! Ссылку изменить нельзя, но состояние объекта изменить можно.
 *
 *
    Что нужно помнить об абстрактных классах:
    ● нельзя создать объект абстрактного класса;
    ● в абстрактном классе могут быть конкретные реализации методов;
    ● если в классе объявлен хоть один абстрактный метод, сам класс должен быть объявлен абстрактным.
 */
public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "белый", 1);
        cat.animalInfo();
        cat.voice();
        cat.jump();
        cat.catCurledUpInAball();

        Animal cat1 = new Cat("Мурзик", "серый", 2);
//        cat1.catCurledUpInAball(); // todo выдает ошибку
            ((Cat) cat1).catCurledUpInAball(); // привели к типу 'Cat'

        System.out.println();
        Dog dog = new Dog();
        dog.animalInfo();
        dog.voice();
        dog.jump();

        System.out.println();

        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(new Cat(), new Dog(), cat, cat1));
        for (Animal animal1: animals){
            animal1.animalInfo();
            System.out.println();
            animal1.jump();
            System.out.println();
            if (animal1 instanceof Cat) { // проверяем на принадлежность к классу
//            animal1.catCurledUpInAball(); // todo так не работаает
                ((Cat) animal1).catCurledUpInAball();   // выдаст ошибку, т.к. у собаки такого метода нет.
                                                        // C if ошибки нет
            }
        }

        System.out.println();




//        System.out.println(animals);

        /*
        MyVector vector1 = new MyVector(2, 3, 4);
        MyVector vector2 = new MyVector(3,4,5);

        System.out.println("vector1.length() = " + vector1.length());
        System.out.println("vector1.scalar(vector2) = " + vector1.scalar(vector2));
        System.out.println("vector1.vectProd(vector2) = " + vector1.vectProd(vector2));
        System.out.println("vector1.angle(vector2) = " + vector1.angle(vector2));
        */

//        Animal animal = new Animal();
//        animal.animalInfo();
//        animal.voice();
//        animal.jump();
//        System.out.println(animal);
    }
}
