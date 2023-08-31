package Lections.Lection2;

public class Foo {
    public Integer value;

    private static Integer count;
//    public static Integer count = 0; // инициализатор, выдаст '0' вместо 'null'

    public static Integer getCount() { // для статики ни 'this' ни 'super' не нужно
        return count;
    }

    static { // статический инициализатор, лучший вариант чем выше с '0'
        count = 0;
    }

    public Foo() {
        count++;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
