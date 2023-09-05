package Seminars.Seminar3.Ex002;

/**
 * Создать перечисление фруктов, сравнить их значение в switch case с различным выводом по каждому типу.
 */
public class Program {
    public static void main(String[] args) {
        Fructs fructs = Fructs.orange;

        switch (fructs) {
            case pear -> System.out.println("груша " + fructs.getName());
            case apple -> System.out.println("яблоко " + fructs.getName());
            case tomato -> System.out.println("помидор " + fructs.getName());
            case orange -> System.out.println("апельсин " + fructs.getName());
            default -> System.out.println("default");
        }

    }
}
