package Seminars.Temp;

public class Main {

    public static String arrStr(String[] arr){

        String string = "";
        if (arr.length < 3){
            string = "-1";
        }else string = String.valueOf(arr.length);
        return string;
    }
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4"};
        System.out.println(arrStr(arr));
    }
}
