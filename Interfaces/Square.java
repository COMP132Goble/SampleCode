package Interfaces;

public class Square implements MyMath {
    public Point topLeft;
    public int length;
    public static final int SIDES = 4;

    public Square(Point topLeft, int length) {
        this.topLeft = topLeft;
        this.length = length;
    }

    // === Implementation of the MyMath interface ===
    public double area() {
        return Math.pow(length, 2);
    }

    public double perimeter() {
        return 4 * length;
    }

    public int numSides() {
        return SIDES;
    }
}
