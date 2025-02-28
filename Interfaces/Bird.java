package Interfaces;

public class Bird implements CanFly {
    public String species;

    public Bird(String species) {
        this.species = species;
    }

    public void fly() {
        System.out.println("Bird flaps wings");
    }

    public void flightNoise() {
        System.out.println("Tweet tweet");
    }
}
