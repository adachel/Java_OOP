package Seminars.Seminar5.InnerClasses;

public class Program {
    public static void main(String[] args) {
//        Outer.Inner inner = new Outer().new Inner(12); // это для внутреннего клaссa
        Outer.Inner inner1 = new Outer.Inner(); // это для вложенного клaссф

        Flyable flyable = new Flyable() { // это пример анонимных классов
            @Override
            public void fly() {
                System.out.println("Fly");
            }
        };
//        flyable.fly();
        System.out.println(flyable.getClass().getName());
        // выдaст Seminars.Seminar5.InnerClasses.Program$1. $1 - это инплиментный счетчик

        String string = "String";
        System.out.println(string.getClass().getName());

    }
}
