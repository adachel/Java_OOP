package Seminars.Seminar1;
// CTRL + ALT + L - выравнивает поля
// CTRL + ALT + O - удаляет не нужные импорты
// SHIFT + F6 - групповое переименование
public class Program {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", "белый", 1);
        cat.animalInfo();
        cat.voice();
        cat.jump();

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
