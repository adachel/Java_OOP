package Seminars.Seminar2;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
    }

//    public abstract void animalInfo() {System.out.println("Животное: " + name);}
    public abstract void animalInfo(); //todo при абстрактном методе записывается только сигнатура

    public void voice() {       // todo обычный метод может находиться в абстрактном классе
        System.out.println("Животное " + name + " издало звук");
    }

//    public abstract void jump() {
//        System.out.println("Животное " + name + " подпрыгнуло");
//    }
    public abstract void jump();
}
