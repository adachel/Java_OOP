package HomeWorks.HomeWork4;

public abstract class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {return name;}
    public int getAge() {return age;}

    public int getRating(){
        if (this instanceof Teacher) return getRating();
        else return 0;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public User(String name) {
        this.name = name;
    }

    public User() {}
}
