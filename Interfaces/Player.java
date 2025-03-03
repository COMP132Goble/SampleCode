package Interfaces;

import java.util.Random;

/**
 * Basic player class that we will use throughout the semester
 * 
 * @author William Goble
 */
public class Player implements Comparable<Player> {
    String name;
    double health;
    double armor;
    public int attackOrder;
    
    public Player(String name) {
        this.name = name;
        health = 100;
        armor = 20;
        attackOrder = 0;
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
        if (amount > armor) {
            amount -= armor;
            
        }
        System.out.println("Ahh! " + name + " has been attacked!");
        health -= amount;   // health = health - amount
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
        health += amount;       // health = health + amount
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void setAttackOrder() {
        Random r = new Random();
        attackOrder =  r.nextInt(20) + 1;
    }

    public int compareTo(Player that) {
        if(this.attackOrder > that.attackOrder) {
            return -1;  // this Player goes before that Player
        } else if (this.attackOrder == that.attackOrder) {
            return 0;   // the Players have the same attack Order
        } else {
            return 1;   // that Player comes before this Player
        }
    }
}