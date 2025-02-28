package Interfaces;

public class Square implements MyMath {
    public Point topLeft;
    public int length;

    public Square(Point topLeft, int length) {
        this.topLeft = topLeft;
        this.length = length;
    }

    // === Implementation of the MyMath interface ===
    public int area() {
        return (int)Math.pow(length, 2);
    }

    public int perimeter() {
        return 4 * length;
    }
}
