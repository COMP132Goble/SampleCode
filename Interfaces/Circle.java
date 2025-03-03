package Interfaces;

public class Circle implements MyMath {
    public Point center;
    public int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // === Implementation of the MyMath interface ===
    public double area() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double perimeter() {
        double value = Math.PI * radius * 2;
        return value;
    }

    public int numSides() {
        return 0;
    }
}
