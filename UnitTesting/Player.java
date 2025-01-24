package UnitTesting;

/**
 * Basic player class that we will use throughout the semester
 * 
 * @author William Goble
 */
public class Player {
    String name;
    double health;
    
    public Player(String name) {
        this.name = name;
        health = 100;
    }

    /**
     * Quick method to see the player's health
     */
    public void show() {
        System.out.println( name + " is at " + health + "% health");
    }

    // mutator methods

    /**
     * The player has been attacked, so let's remove some of their health
     * @param amount
     */
    public void takeDameage(double amount) {
        System.out.println("Ahh! " + name + " has been attacked!");
        health -= amount;   // health = health + amount
    }

    /**
     * After a long rest, the player is brought back to full health
     */
    public void longRest() {
        health = 100;
    }

    /**
     * Heals the player by a given amount
     * @param amount
     */
    public void heal(double amount) {
        health -= amount;       // health = health - amount
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }
}