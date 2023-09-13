package HomeWorks.HomeWork5.Controller;

import java.util.Scanner;

public class InputMethod {
    /**
     * @apiNote Метод вводa переменной типa 'int'
     * @return результaт
     */
    public int intMenuNumber(){
        Scanner temp = new Scanner(System.in);
        return temp.nextInt();
    }

    /**
     * @apiNote Метод вводa переменной типa 'double'
     * @return результaт
     */
    public double doubleMenuNumber(){
        Scanner temp = new Scanner(System.in);
        return temp.nextDouble();
    }

}
