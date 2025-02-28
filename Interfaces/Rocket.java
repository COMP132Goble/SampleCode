package Interfaces;

public class Rocket implements CanFly {
    public String country;

    public Rocket(String country) {
        this.country = country;
    }

    public void fly() {
        System.out.println("Uses fins and larger thrusters");
    }

    public void flightNoise() {
        System.out.println("*** Rocket Noises ***");
    }
}
