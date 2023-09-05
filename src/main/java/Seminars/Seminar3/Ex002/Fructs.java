package Seminars.Seminar3.Ex002;

public enum Fructs {
    apple, orange("апельсин"), tomato, pear;
    private String name; // допустим доп инфо это название

    public String getName() {return name;}

    Fructs(String name) {this.name = name;} // по умолчанию здесь 'private'
    Fructs() {}
}
