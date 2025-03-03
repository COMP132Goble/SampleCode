package Interfaces;

public class Triangle implements MyMath {
    public int side1;
    public int side2;

    public Triangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    // === Implementation of the MyMath interface ===
    public double area() {
        return (side1 * side2) / 2;
    }

    public double perimeter() {
        int first = side1 + side2;
        double hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return (first + hypot);
    }

    public int numSides() {
        return 3;
    }
}
