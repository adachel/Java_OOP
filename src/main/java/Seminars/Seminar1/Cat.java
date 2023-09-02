package Seminars.Seminar1;

public class Cat extends Animal {


    private String color;
    private int age;
    public Cat(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public int getAge() {return age;}
    public void setAge(int age) {
        if (age < 1 || age > 30) {
            throw new IllegalArgumentException("Возраст кота должен быть больше '0' и меньше '30'! " +
                    "Задайте корректный возраст.");
        }else  this.age = age;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void animalInfo() {
        System.out.println("Кот: " + name + ";" + "\n" + "Цвет: " + color + ";" + "\n" + "Возраст: " + age);
    }

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void jump() {
        super.jump();
    }
}
