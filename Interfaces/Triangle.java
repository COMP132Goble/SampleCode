package Interfaces;

public class Triangle implements MyMath {
    public int side1;
    public int side2;

    public Triangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    // === Implementation of the MyMath interface ===
    public int area() {
        return (side1 * side2) / 2;
    }

    public int perimeter() {
        int first = side1 + side2;
        double second = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return (int)(first + second);
    }
}
