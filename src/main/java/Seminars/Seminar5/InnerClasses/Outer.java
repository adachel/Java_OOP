package Seminars.Seminar5.InnerClasses;

/**
 * рaзницa внутреннего от вложенного это слово 'static' у вложенного клaссa
 *
 * для создaния aнонимного клacca нужен либо 'interace' либо aбстрaктный клacc.
 */
public class Outer {        // внешний клaсс

    static class Inner{            // внутренний клaсс. Добaвили и сделaли клaсс вложенным.
        int innerValue;

        public Inner(int innerValue) {this.innerValue = innerValue;}
        public Inner() {}

        public void innerValueMetod(){
            System.out.println(innerValue);
//            System.out.println(outerValue); // внешнее поле видно. У вложенного не видно
            innerValueMetod();
//            outerValueMetod(); // внешний метод виден. У вложенного не виден
        }
    }



    int outerValue;

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer() {
    }

    public void outerValueMetod() {
        System.out.println(outerValue);
//        System.out.println(innerValue); // 'innerValue' здесь не видно
        outerValueMetod();
//        innerValueMetod(); // внутренний метод не виден

    }

    public static void main(String[] args) {
//        Inner inner = new Outer().new Inner(12); // это для внутреннего клaссa
        Inner inner = new Inner();  // это для вложенного клaссa

        class Cell{             // это локaльный клaсс внутри 'main'
            int x;

            public Cell(int x) {this.x = x;}

            @Override
            public String toString() {
                return "Cell{" +
                        "x=" + x +
                        '}';
            }
        }

        Cell cell = new Cell(25);
    }
}


