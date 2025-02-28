package Interfaces;

public class Circle implements MyMath {
    public Point center;
    public int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // === Implementation of the MyMath interface ===
    public int area() {
        return (int)(Math.PI * Math.pow(radius, 2));
    }

    public int perimeter() {
        int value = (int)(Math.PI * radius * 2);
        return value;
    }
}
