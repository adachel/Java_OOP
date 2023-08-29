package Lections.Lection1.Incapsulacia;

import java.util.ArrayList;

/**
 * Don't repeat yourself (DRY; с англ. — «не повторяйся») — это принцип разработки программного обеспечения,
 * нацеленный на снижение повторения информации различного рода, особенно в системах
 * со множеством слоёв абстрагирования.
 */

public class RobotBetter {
    enum State{     // относится к состоянию. Либо робот вкл, либо выкл
        ON, OFF
    }
    private static int defaultIndex;        // статические поля. В рамках класса не допускается использовать несколько
                                            // персонажей с одинаковыми именами
    private static ArrayList<String> names; // коллекция имен

    static {        // статический инициализатор
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    /** Уровень робота */
    private  int level;

    /** Имя робота */
    private String name;
    private State state;    // добавляется новое поле - СОСТОЯНИЕ

    private RobotBetter(String name, int level){ // если сделать 'private', то пользователь будет задавать только имя
        if ((name.isEmpty()     // если имя будет пустым
                || Character.isDigit(name.charAt(0)))       // или первый символ будет цифрой
                || !RobotBetter.names.contains(name)){  // или такое имя было задано ранее
            this.name = String.format("DefaultName_%d", defaultIndex++);    // тогда придумаем какое-то дефолтное имя
        }else {
            this.name = name;  // если все нормально, то берем имя пользователя
        }

        RobotBetter.names.add(this.name);
        this.level = level;     // производим инициализацию уровня
        this.state = State.OFF; // производим инициализацию начального состояния
    }
    /** Другие конструкторы, но не корректно, нарушается принцип DRY */
//    public RobotBetter(String name){    // конструктор с одним параметром
//        if ((name.isEmpty()     // если имя будет пустым
//                || Character.isDigit(name.charAt(0)))       // или первый символ будет цифрой
//                || RobotBetter.names.indexOf(name) == -1){  // или такое имя было задано ранее
//            this.name = String.format("DefaultName_%d", defaultIndex++);    // тогда придумаем какое-то дефолтное имя
//        }else {
//            this.name = name;  // если все нормально, то берем имя пользователя
//        }
//
//        RobotBetter.names.add(this.name);
//        this.level = 1;     // присваиваем '1'
//        this.state = State.OFF; // производим инициализацию начального состояния
//    }
//
//    public RobotBetter(){       // конструктор без параметров
//        this.name = String.format("DefaultName_%d", defaultIndex++);    // тогда придумаем какое-то дефолтное имя
//
//        RobotBetter.names.add(this.name);
//        this.level = 1;     // производим инициализацию уровня
//        this.state = State.OFF; // производим инициализацию начального состояния
//    }

    /** Правильные конструкторы */
    public RobotBetter(String name){
        this(name, 1);
    }

    public RobotBetter(){
        this("");
    }

    // Методы вкл/выкл
    public void power(){
        if (this.state == State.OFF){ // если система выключена
            this.powerON();     // вызвать логику вкл
            this.state = State.ON;   // поменять состояние, что робот вкл
        }else {         // если робот вкл
            this.powerOFF();    // вызвать логику выключения
            this.state = State.OFF;     // поменять состояние
        }
        System.out.println();
    }
    private void powerON() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOFF() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /** Работа */
    public void work() {
        if (this.state == State.ON) {
            System.out.println("Working...");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }

}
