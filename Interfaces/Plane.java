package Interfaces;

public class Plane implements CanFly {
    public String planeType;

    public Plane(String planeType) {
        this.planeType = planeType;
    }

    public void fly() {
        System.out.println("Uses wings and thrusters to fly");
    }

    public void flightNoise() {
        System.out.println("WooooooOOOOOooosh");
    }
}
