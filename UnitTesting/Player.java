package UnitTesting;

public class Player {
    String name;
    double health;
    
    public Player(String name) {
        this.name = name;
        health = 100;
    }

    public void show() {
        System.out.println( name + " is at " + health + "% health");
    }

    public void takeDameage(double amount) {
        health -= amount;
    }

    public void longRest() {
        health = 100;
    }

    public void heal(double amount) {
        health += amount;
    }
}