package Lections.Lection1.Incapsulacia;

public class Robot {
    /** Уровень робота */
//     public  int level;
     private int level; // закрыл поле для пользователя

    /** Имя робота */
//     public String name;
     private String name;

    public Robot(String name, int level){   // конструктор
        this.name = name;
        this.level = level;
    }

    public int getLevel() {     // видимость пользователю
        return level;
    }

    public String getName() {
        return name;
    }

    // Методы вкл/выкл подсистем
    /** Загрузка БИОС */
    private void startBIOS(){       // 'public' заменилм на 'private
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS(){
        System.out.println("Stsrt OS...");
    }

    /** Приветсвие */
    private void sayHi(){
        System.out.println("Hello World...");
    }

    public void powerOn(){ // создали метод 'public' с нужным порядком вкл методов
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    /** Выгрузка BIOS */
    private void stopBIOS(){
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void StopOS(){
        System.out.println("Stop OS");
    }

    /** Прощание */
    private void sayBye(){
        System.out.println("Bye...");
    }

    public void powerOFF(){
        this.sayBye();
        this.StopOS();
        this.stopBIOS();
    }

    /** Работа */
    public void Working(){
        System.out.println("Работа...");
    }





}
