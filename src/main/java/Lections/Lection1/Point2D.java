package Lections.Lection1;

public class Point2D {  // класс - точка на плоскости

    private int x, y; // поля класса

    /**
     * Конструктор
     * @param valueX координата Х
     * @param valueY координата Y
     */
    public Point2D(int valueX, int valueY){ // создаем конструктор
        x = valueX;
        y = valueY;
    }

    public Point2D(int value){  // это вместо двух снизу
        this(value, value);
    }
    public Point2D(){   // так должно быть
        this(0);
    }
//    public Point2D(){
//        x = 0;
//        y = 0;
//    }
//
//    public Point2D(int value){
//        x = value;
//        y = value;
//    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }

    public String getInfo(){    // метод для корректного вывода в консоль.
                                // Технически не нужен, можно подставить, где переопределение.
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
//        return super.toString();
        return getInfo();   // переопределили существующий метод 'toString'
    }
}
