package HomeWorks.HomeWork5.Controller;

import java.util.Scanner;

public class InputMethod {
    public int intMenuNumber(){
        Scanner temp = new Scanner(System.in);
        return temp.nextInt();
    }
    public double doubleMenuNumber(){
        Scanner temp = new Scanner(System.in);
        return temp.nextDouble();
    }

}
