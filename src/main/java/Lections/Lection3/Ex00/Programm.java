package Lections.Lection3.Ex00;

import Lections.Lection3.Ex00.Foo;

public class Programm {
    public static void main(String[] args) {
        Foo foo1 = new Foo() {
            @Override
            public void qwe() {
                System.out.println("qwe");
            }

            @Override
            public void asd() {
                System.out.println("asd");
            }
        };
        foo1.qwe();

    }
}
