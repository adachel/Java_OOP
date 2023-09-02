package Seminars.Seminar1;

public class MyVector {
    private double x, y, z;

    public MyVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {return x;}
    public void setX(double x) {this.x = x;}

    public double getY() {return y;}
    public void setY(double y) {this.y = y;}

    public double getZ() {return z;}
    public void setZ(double z) {this.z = z;}

    @Override
    public String toString() {
        return "myVector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @apiNote метод, вычисляющий длину вектора
     * @return длина вектора
     */
    public double length() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    /**
     * @apiNote метод, вычисляющий скалярное произведение двух векторов
     * @param vector2 - вектор, с которым происходит умножение
     * @return - скалярное произведение
     */
    public double scalar(MyVector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * @apiNote метод вычисляющий векторное произведение двух векторов
     * @param vector вектор, с которым происходит произведение
     * @return векторное произведение
     */
    public MyVector vectProd(MyVector vector) {
        return new MyVector(y * vector.z - z * vector.y,
                            z * vector.x - x * vector.z,
                            x * vector.y - y * vector.x);
    }

    /**
     * @apiNote метод, вычисляющий угол между векторами
     * @param vector второй вектор
     * @return угол между векторами
     */
    public double angle(MyVector vector) {
        return scalar(vector) / (length() * vector.length());
    }
}
