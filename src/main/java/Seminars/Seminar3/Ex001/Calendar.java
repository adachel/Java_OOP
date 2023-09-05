package Seminars.Seminar3.Ex001;

public class Calendar {
    public static void main(String[] args) {
        Month month1 = Month.jan;
        month1 = Month.apr; // переприсвоил значение из пула значений 'Month'
        month1.valueOf("apr");
        month1.setNumber(3);
        System.out.println("month1.valueOf(\" apr \") = " + month1.valueOf("apr"));
        month1.getNumber();
        System.out.println("month1.getNumber() = " + month1.getNumber());


    }
}
